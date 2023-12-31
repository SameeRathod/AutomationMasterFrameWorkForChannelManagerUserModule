package com.axisrooms.channelManagerUserModule.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

//it will execute each time test method is called
//here we can customize based on any annotation
//used this class on TestNG xml remove ITestListener And Add This Class name
public class AnnotationTransformer implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		Map<String,Object> test1=new HashMap<>();
		test1.put("name", "test1");
		test1.put("count", "5");
		test1.put("enabled", false);
		
		//we can add multiple map and test hear
		
		List<Map<String,Object>> list=new ArrayList<>();
		list.add(test1);
		
		for(int i=0; i<list.size(); i++) {
			if(testMethod.getName().equalsIgnoreCase(String.valueOf(list.get(i).get("name")))) {
				if(list.get(i).get("enabled").equals(false)) {
					annotation.setEnabled(false);
				}
				else {
					//annotation.setInvocationCount(Integer.parseInt((String)list.get(i).get("count")));
					annotation.setRetryAnalyzer(Retry.class);
					//if i don't want add retry method in xml file so added hear
					//Don't combined setInvocationCount And Retry 
				}
			}
		}
		/*if (testMethod.getName().equalsIgnoreCase("test1")) {
			annotation.setEnabled(false);
			

		}*/
	}
}

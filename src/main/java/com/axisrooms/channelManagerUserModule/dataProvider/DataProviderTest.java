package com.axisrooms.channelManagerUserModule.dataProvider;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.axisrooms.channelManagerUserModule.constants.FrameworkConstant;
import com.axisrooms.channelManagerUserModule.utils.ExcelUtility;



public class DataProviderTest {
	
	private static List<Map<String, String>> list=new ArrayList<>();
	@DataProvider
	public static Object[] getData(Method m) {
		
		String testName=m.getName();
		
		if(list.isEmpty()) {
		list = ExcelUtility.getTestDetails(FrameworkConstant.iterationSheet());
		}
		
		List<Map<String, String>> iterationList=new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).get("TestName").equalsIgnoreCase(testName)&&(list.get(i).get("Execute").equalsIgnoreCase("yes"))) {
				 {
					iterationList.add(list.get(i));
				}
			}
		}
		//list.removeAll(iterationList);
		return iterationList.toArray();
	}
	
	
}

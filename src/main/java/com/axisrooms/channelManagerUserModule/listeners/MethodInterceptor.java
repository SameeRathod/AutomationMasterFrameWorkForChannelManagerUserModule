package com.axisrooms.channelManagerUserModule.listeners;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import com.axisrooms.channelManagerUserModule.constants.FrameworkConstant;
import com.axisrooms.channelManagerUserModule.utils.ExcelUtility;

public class MethodInterceptor implements IMethodInterceptor {
//it will execute only once for entire suit
	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {

		List<Map<String, String>> list = ExcelUtility.getTestDetails(FrameworkConstant.runManagerSheet());
		List<IMethodInstance> result = new ArrayList<>();

		for (int i = 0; i < methods.size(); i++) {
			for (int j = 0; j < methods.size(); j++) {
				if (methods.get(i).getMethod().getMethodName().equalsIgnoreCase(list.get(j).get("TestCaseName"))
						&& (list.get(j).get("Execute").equalsIgnoreCase("yes")))
					;
				if (list.get(j).get("Execute").equalsIgnoreCase("yes")) {
					methods.get(i).getMethod().setDescription(list.get(j).get("Test Case Description"));
					methods.get(i).getMethod().setInvocationCount(Integer.parseInt(list.get(j).get("InvocationCount")));
					methods.get(i).getMethod().setPriority(Integer.parseInt(list.get(j).get("Priority")));
					result.add(methods.get(i));
				}
			}

		}

		return result;
	}

}

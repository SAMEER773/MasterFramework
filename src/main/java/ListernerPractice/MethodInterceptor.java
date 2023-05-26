package ListernerPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

public class MethodInterceptor implements IMethodInterceptor {

	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		//list will contain all the test that testng going to execute
		List<IMethodInstance> result=new ArrayList<IMethodInstance>();//add remove the test case at the runtime we use this things
		//and to enable disable test we use this but if there is the 100 or 1000 test case we modify in Excel
		//result.add(methods.get(0));
		
		Map<String, String>map=new HashMap<String, String>();
		map.put("name", "test1");
		map.put("count", "5");
		
		Map<String, String>map1=new HashMap<String, String>();
		map1.put("name", "test2");
		map1.put("count", "2");
		
		List<Map<String, String>> list=new ArrayList<Map<String,String>>();
		list.add(map1);
		list.add(map);
		
		for(int i=0; i<methods.size(); i++) {
			for(int j=0; j<list.size(); j++) {
				if(methods.get(i).getMethod().getMethodName().equalsIgnoreCase(list.get(j).get("name"))) {
					methods.get(i).getMethod().setInvocationCount(Integer.parseInt(list.get(j).get("count")));
					result.add(methods.get(i));
					
				}
			}
		}
		
		return result;
		
	}

}

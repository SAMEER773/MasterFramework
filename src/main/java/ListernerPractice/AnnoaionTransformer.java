package ListernerPractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnoaionTransformer implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "test1");
		map.put("count", "5");
		map.put("enabled", false);

		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("name", "test2");
		map1.put("count", "2");
		map1.put("enabled", true);

		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		list.add(map1);
		list.add(map);
		
		for (int i=0; i<list.size(); i++) {
			
			if(testMethod.getName().equalsIgnoreCase(String.valueOf(list.get(i).get("name")))) {
				if(list.get(i).get("enabled").equals(false)) {
					annotation.setEnabled(false);
				}
				else {
					//annotation.setInvocationCount(Integer.parseInt((String) list.get(i).get("count")));
					annotation.setRetryAnalyzer(Retry.class);
				}
				
			}
			
		}
	}

	

}

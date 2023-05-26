package org.sam.dataproviderprac;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.sam.constant.FrameworkConstant;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataProviderUsingJSON {
	@Test(dataProvider = "data")
	public void jsonTest(Map<String, Object> map) {

		for (Map.Entry<String, Object> m : map.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());

		}
		System.out.println(map);

	}

	@DataProvider(name = "data")
	public Object[] getData() throws IOException {
		HashMap<String, Object> map = new ObjectMapper().readValue(new File(FrameworkConstant.jsonFilePath()),
				new TypeReference<HashMap<String, Object>>() {
				});
		return new Object[] { map };
	}

}

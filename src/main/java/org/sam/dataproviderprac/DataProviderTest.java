package org.sam.dataproviderprac;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "all", dataProviderClass = DataProviderTest.class)
	public void test(String username , String password) {
		
		System.out.println(username+ password);
		
	}
	
	@Test(dataProvider = "data")
	public void test1(String username) {
		System.out.println(username);
	}
	@DataProvider(name = "data")
	public String[] getdata() {
		String [] st= {"abcd","pqrs","stuv"};
		
		return st;
	}
	
	@DataProvider(name = "all")
	public String[][] getdata1() {
		return new String[][] {
			{"abcd","pqrs"},{"pqrs","stvw"},{"stuv","aaaaa"}
		};
	}
	

}

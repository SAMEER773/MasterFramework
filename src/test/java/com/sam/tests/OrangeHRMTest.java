package com.sam.tests;

import org.assertj.core.api.Assertions;
import org.sam.utils.GetTitle;
import org.sam.utils.LoginAndLogoutUtility;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public final class OrangeHRMTest extends BaseTest {

	private OrangeHRMTest() {

	}

	@Test(dataProvider = "logintest")
	public void loginLogoutTest(String username, String password) throws Exception {
		
		
		LoginAndLogoutUtility.login(username, password);
		Assertions.assertThat(GetTitle.title()).isNotNull().isEqualTo("OrangeHRM");
		LoginAndLogoutUtility.logout();
		Assertions.assertThat(GetTitle.title()).isNotNull().isEqualTo("OrangeHRM");

	}

	@DataProvider(name = "logintest", parallel = true)
	public Object[][] getData() {
		return new Object[][] { { "admin", "admin123" }, { "admin", "admin123" } };
	}
}

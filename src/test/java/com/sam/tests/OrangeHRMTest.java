package com.sam.tests;

import org.assertj.core.api.Assertions;
import org.sam.utils.GetTitle;
import org.sam.utils.LoginAndLogoutUtility;
import org.testng.annotations.Test;

public final class OrangeHRMTest extends BaseTest {
	
	private OrangeHRMTest() {
		
	}
	@Test
	public void loginLogoutTest() {
		
		LoginAndLogoutUtility.login();
		Assertions.assertThat(GetTitle.title()).isNotNull().isEqualTo("OrangeHRM");
		LoginAndLogoutUtility.logout();
		
		
		
		
		
	}
	

}

package org.sam.utils;

import org.sam.pages.HomePage;
import org.sam.pages.LoginPage;
import org.testng.annotations.Test;

public final class LoginAndLogoutUtility {
	@Test(dataProvider = "logintest", dataProviderClass = Object.class)
	public static void login(String username,String password) {
		LoginPage page=new LoginPage();
		try {
			page.userNameTextField(username)
			.passwordTextField(password).loginButton();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public static void logout() throws Exception {
		
		HomePage hm=new HomePage();
		hm.paulCollingsDropDown().logoutLink();
		
		
		
	}
	
	

}

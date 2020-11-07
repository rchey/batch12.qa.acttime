package com.acti.testcase;

import org.testng.annotations.Test;

public class TC01_LoginTest extends BaseTest {
	

	@Test
	public void testLoginFunction()
	{
		loginPage.loginToApplication("admin", "manager");	
	}
	
	//@Test
	public void testVerifyLogoDisplayed()
	{
		boolean flag = loginPage.verifyActiLogo();
		System.out.println(flag);
	}
}
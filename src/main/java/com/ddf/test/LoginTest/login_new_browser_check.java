package com.ddf.test.LoginTest;

import org.testng.annotations.Test;

import com.ddf.base.BaseUI_v1;

public class login_new_browser_check extends BaseUI_v1
{
	@Test
	public void mainmeth1() throws InterruptedException
	{
		invokeBrowser("Firefox");
		openURL("https://www.google.co.in/");
		//elementClick("//a[contains(text(),'gmail')]");
		//enterText("//input[@id='login1']","U S E R N A M E");
		Thread.sleep(2000);
		tearDown();
	}
	
	//msedgedriver
	@Test 
	public void meth1()
	{
		invokeBrowser("firefox");
		openURL("https://www.amazon.in/");
		tearDown();
	}
	
	@Test 
	public void meth2()
	{
		invokeBrowser("edge");
		openURL("https://www.amazon.in/");
		tearDown();
	}


}

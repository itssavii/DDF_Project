package com.ddf.test.LoginTest;

import org.testng.annotations.Test;

import com.ddf.base.BaseUI_v2;

public class create_data_check extends BaseUI_v2
{
	@Test
	public void testOne() throws InterruptedException 
	{
		invokeBrowser("chrome");
		openURL("websiteURL");
		elementClick("create_link");
		enterText("usernameTextbox_Xpath","U S E R N A M E");
		Thread.sleep(2000);
		tearDown();
	}

}

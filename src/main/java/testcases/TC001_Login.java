package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_Login extends ProjectMethods{
	

	@BeforeTest
	public void setData() {
		testCaseName="TC001_Login";
		testDescription="Logs into instance";
		testNodes="Leads";
		category="Smoke";
		authors="Jeyamurugan";
		browserName="chrome";
		dataSheetName="TC001";
	}
		
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd) throws InterruptedException {
		
		new LoginPage()
		.switchtologin()
		.enterUsername(uName)
		.enterpassword(pwd)
		.clickLogIn();

	}


}

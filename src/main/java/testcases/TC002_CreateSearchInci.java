package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateSearchInci extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreateInci";
		testDescription="Creates new incident and searches";
		testNodes="Leads";
		category="Smoke";
		authors="Jeyamurugan";
		browserName="chrome";
		dataSheetName="TC002";
	}
		
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String desc) throws InterruptedException {
		
		new LoginPage()
		.switchtologin()
		.enterUsername(uName)
		.enterpassword(pwd)
		.clickLogIn()
		.clickIncident()
		.switchinci()
		.newInci()
		.getNumber()
		.typeDescription(desc)
		.clickSubmit()
		.enterNumber();

	}


}

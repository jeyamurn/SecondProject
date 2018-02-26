package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_Open_Unassinged extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_OPenUnassinged";
		testDescription="Updates the inci";
		testNodes="Leads";
		category="Smoke";
		authors="Jeyamurugan";
		browserName="chrome";
		dataSheetName="TC003";
	}
		
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd, String desc) throws InterruptedException {
		
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
		.switchtmainpage()
		.enterFilter()
		.clickOpen()
		.switchinci()
		.enterInstance()
		.clickInstance()
		.selectState()
		.selectAssign()
		.clickUpdate()
		.switchtmainpage()
		.clickOpen1()
		.switchinci()
		.enterInstance()
		.getState()
		.getAssign();
	}

}

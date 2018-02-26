package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{

	public LoginPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="gsft_main")
	private WebElement eleswitchtologin;

	public LoginPage switchtologin() {

		switchToFrame(eleswitchtologin);
		return this;
	}


	@FindBy(how=How.ID,using="user_name")
	private WebElement eleusername;

	public LoginPage enterUsername(String data) {

		type(eleusername, data);
		return this;
	}


	@FindBy(how=How.ID,using="user_password")
	private WebElement eleuserpwd;

	public LoginPage enterpassword(String data) {

		type(eleuserpwd, data);
		return this;
	}

	@FindBy(how=How.ID,using="sysverb_login")
	private WebElement eleLogin;

	public SystemAdmin clickLogIn() throws InterruptedException {

		click(eleLogin);
		Thread.sleep(3000);
		return new SystemAdmin();

	}
}





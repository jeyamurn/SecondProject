package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Users extends ProjectMethods{
	
	public Users() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH,using="(//input[@class = 'form-control'])[1]")
	private WebElement elesearch;

	public Users typeItil() {
		
		Enter(elesearch, "ITIL");
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="ITIL User")
	private WebElement eleselcetitil;

	public InstancePage selectITil() {
		
		click(eleselcetitil);
		switchToWindow(0);
		return new InstancePage();
	}
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SystemAdmin extends ProjectMethods{

	
	public SystemAdmin() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH,using="//div[text() = 'Incidents']")
	private WebElement eleinci;

	public Incidents clickIncident() throws InterruptedException {
		
		click(eleinci);
		Thread.sleep(1000);
		return new Incidents();
	}

	@FindBy(how=How.ID,using="filter")
	private WebElement elefilter;

	public Incidents enterFilter() throws InterruptedException {
		
		Enter(elefilter, "incident");
		Thread.sleep(3000);
		return new Incidents();
	}
	

	@FindBy(how=How.XPATH,using="//div[text() = 'Open']")
	private WebElement eleopen1;

	public Incidents clickOpen1() throws InterruptedException {

		click(eleopen1);
		Thread.sleep(2000);
		return new Incidents();
	}
	
}

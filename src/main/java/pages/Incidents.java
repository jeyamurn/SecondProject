package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Incidents extends ProjectMethods{
	
	public static String number;
	
	public Incidents() {
		PageFactory.initElements(driver,this);
	}	

	
	@FindBy(how=How.ID,using="gsft_main")
	private WebElement eleswitchinci;

	public Incidents switchinci() {

		switchToFrame(eleswitchinci);
		return this;
	}

	@FindBy(how=How.XPATH,using="//button[text() = 'New']")
	private WebElement elenewinci;

	public Incidents newInci() {

		click(elenewinci);
		return this;
	}

	@FindBy(how=How.ID,using="incident.number")
	private WebElement elegetnumber;

	public Incidents getNumber() {

		number = getAttribute(elegetnumber, "value");
		System.out.println(number);
		return this;
	}
	
	@FindBy(how=How.ID,using="incident.short_description")
	private WebElement eletypedescript;

	public Incidents typeDescription(String data) {

		type(eletypedescript, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//button[text() = 'Submit'])[1]")
	private WebElement eleclicksubmit;

	public Incidents clickSubmit() throws InterruptedException {

		click(eleclicksubmit);
		Thread.sleep(2000);
		return this;
	}

	@FindBy(how=How.XPATH,using="(//input[@class = 'form-control'])[1]")
	private WebElement eletypenumber;

	public Incidents enterNumber() {

		Enter(eletypenumber, number);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[text() = 'Open - Unassigned']")
	private WebElement eleopen;

	public Incidents clickOpen() throws InterruptedException {

		click(eleopen);
		Thread.sleep(3000);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="(//input[@class = 'form-control'])[1]")
	private WebElement eleenterinstance;

	public Incidents enterInstance() throws InterruptedException {

		Enter(eleenterinstance, number);
		Thread.sleep(2000);
		return this;
	}
		
	@FindBy(how=How.XPATH,using="//a[@class = 'linked formlink']")
	private WebElement eleclickinstance;

	public InstancePage clickInstance() throws InterruptedException {

		click(eleclickinstance);
		Thread.sleep(2000);
		return new InstancePage();
	}
	
	public SystemAdmin switchtmainpage(){

	switchtoDefault();
		
		return new SystemAdmin();
	}	
			@FindBy(how=How.XPATH,using="(//td[@class = 'vt'])[6]")
			private WebElement elegetstate;

			public Incidents getState() {

				String state = getText(elegetstate);
				verifyExactText(elegetstate, state);
				System.out.println("State verified successfully");
				return this;
			}

			
			@FindBy(how=How.LINK_TEXT,using="ITIL User")
			private WebElement elegetassign;

			public Incidents getAssign() {

				String state1 = getText(elegetassign);
				verifyExactText(elegetassign, state1);
				System.out.println("Assignment verified");
				return this;
			}
}

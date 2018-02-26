package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class InstancePage extends ProjectMethods {

	public InstancePage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="incident.state")
	private WebElement elestate;

	public InstancePage selectState() throws InterruptedException {
		
		selectDropDownUsingText(elestate, "In Progress");
		Thread.sleep(2000);
		return this;
	}
	
	@FindBy(how=How.ID,using="sys_display.incident.assigned_to")
	private WebElement eleAssign;

	public InstancePage selectAssign() throws InterruptedException {
		
		
		type(eleAssign, "ITIL User");
		Thread.sleep(3000);
		return this;
	}
	
			@FindBy(how=How.XPATH,using="(//button[text() = 'Update'])[1]")
			private WebElement eleupdate;

			public Incidents clickUpdate() throws InterruptedException {
				
				click(eleupdate);
				
				Thread.sleep(2000);
				return new Incidents();
			}
}

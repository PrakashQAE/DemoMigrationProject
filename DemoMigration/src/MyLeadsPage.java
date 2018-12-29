package pages.testleaf;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeadsPage extends LeafTapsWrappers {
	

	public MyLeadsPage(RemoteWebDriver driver,ExtentTest test)
	{
		 this.driver = driver;
		 this.test = test;
		if(!verifyTitle("My Leads | opentaps CRM"))
		{
			reportStep("Landed in a wrong page", "FAIL");
		}
	}

	public CreateLeadPage clickCreateLead() 
	{
		clickByLink("Create Lead");
		return new CreateLeadPage(driver, test);

	}



}

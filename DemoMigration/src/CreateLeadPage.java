package pages.testleaf;

import org.openqa.selenium.WebDriverException;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers{
	//
	//
	//S

	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Create Lead | opentaps CRM"))
		{
			reportStep("Landed in a wrong page", "FAIL");
		}
	}

	public CreateLeadPage enterCompname(String Data)
	{
		enterById("createLeadForm_companyName", Data);

		return this;
	}

	public CreateLeadPage enterFirstname(String Data)
	{
		enterById("createLeadForm_firstName", Data);

		return this;
	}
	public CreateLeadPage enterLastname(String Data)
	{
		enterById("createLeadForm_lastName", Data);

		return this;
	}

	public ViewLeadPage clickCreateLead() 	
	{
		clickByName("submitButton");		

		return new ViewLeadPage();

	}
}


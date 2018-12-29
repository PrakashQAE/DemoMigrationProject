package testCases.testleaf;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pages.testleaf.CreateLeadPage;
import pages.testleaf.HomePage;
import pages.testleaf.LoginPage;
import pages.testleaf.MyHomePage;
import pages.testleaf.MyLeadsPage;
import wrappers.LeafTapsWrappers;

public class TC003_CreateLead  extends LeafTapsWrappers {



	@BeforeClass
	public void testDetails(){

		testCaseName = "TC003_CreateLead";
		testDescription = "Login to Leaftaps";
		category = "Smoke";
		authors = "Gopi";
		browserName = "chrome";
		dataSheetName = "TC003";

	}


	@Test(dataProvider="fetchData")
	public void login(String UName, String Pwd, String LgdUser, String Cname, String Fname, String Lname )
	{
		
		new LoginPage(driver, test)
		.enterUserName(UName)
		.enterPassword(Pwd)
		.clickLogin()
		.verifyLoginName(LgdUser);
		//.clickLogOut();
		new HomePage(driver, test)
		.clickCRMSFA();
		new MyHomePage(driver, test)
		.clickLeadsLink();
		new MyLeadsPage(driver, test)
		.clickCreateLead();
		new CreateLeadPage(driver, test)
		.enterCompname(Cname)
		.enterFirstname(Fname)
		.enterLastname(Lname);
	}

}

package testCases.testleaf;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.testleaf.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001_Login extends LeafTapsWrappers {

	@BeforeClass
	//Step 1
	//This is the starting point of execution which holds all details of the test case
	public void testDetails(){
	
		testCaseName = "TC001_Login";
		testDescription = "Login to Leaftaps";
		category = "Smoke";
		authors = "Gopi";
		browserName = "chrome";
		dataSheetName = "TC001";
		
	}
	//Before executing @Test the engine executes @Before method in LeafTapsWrappers Class
	//Step 3
	@Test(dataProvider="fetchData")
	public void login(String UName, String Pwd, String LgdUser){
		//Creating an object for LoginPage and calling LoginPage 
		// LoginPage 
		new LoginPage(driver, test)
		.enterUserName(UName)
		.enterPassword(Pwd)
		.clickLogin()
		.verifyLoginName(LgdUser);
		//.clickLogOut();
	}
}

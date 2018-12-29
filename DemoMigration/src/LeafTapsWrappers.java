package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.testleaf.DataInputProvider;

public class LeafTapsWrappers extends GenericWrappers {
	
	public String browserName;
	public String dataSheetName;
	
	

	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeTest
	public void beforeTest(){
		loadObjects();
	}
	
	@BeforeMethod
	//Step 2
	// 
	public void beforeMethod(){
		//Calling startTestCase method from Reporter class
		test = startTestCase(testCaseName, testDescription);
		//Calling assignCategory method from ExtentTest Class
		test.assignCategory(category);
		////Calling assignAuthor method from ExtentTest Class		
		test.assignAuthor(authors);
		//calling invokeApp from GenericWrappers class
		invokeApp(browserName);
		
	}
		
	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	@AfterTest
	public void afterTest(){
		unloadObjects();
	}
	
	@AfterMethod
	public void afterMethod(){
		endTestcase();
		quitBrowser();
		
	}
	
	@DataProvider(name="fetchData")
	public  Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);		
	}	
	
	
}







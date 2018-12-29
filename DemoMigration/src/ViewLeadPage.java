package pages.testleaf;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers{
	
	public ViewLeadPage()
	{

		if(!verifyTitle("View Lead | opentaps CRM"))
		{
			reportStep("Landed in a wrong page", "FAIL");
		}
	}
	

}

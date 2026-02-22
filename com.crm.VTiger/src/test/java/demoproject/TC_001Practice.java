package demoproject;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactPage;
import objectRepo.CreatingNewLeadPage;
import objectRepo.CreatingnewContact;
import objectRepo.HomePage;
import objectRepo.LeadPage;

public class TC_001Practice extends BaseClass {

	@Test
	public void createnewLead() throws IOException
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadPage lp=new LeadPage(driver);
		lp.CreateLead();
		String fname=eutil.getSingleCellDataFromExcel("Leads", 1, 1);
		String lname=eutil.getSingleCellDataFromExcel("Leads", 1, 2);
		String company=eutil.getSingleCellDataFromExcel("Leads", 1, 3);
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fname,lname,company);
		System.out.println("New Lead is Created");   
		
	}
	
}

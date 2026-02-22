package demoproject;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactPage;
import objectRepo.CreatingNewLeadPage;
import objectRepo.CreatingnewContact;
import objectRepo.HomePage;
import objectRepo.LeadPage;

public class TC_002Practice extends BaseClass {

	
	@Test
	public void createnewLead1() throws IOException
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadPage lp=new LeadPage(driver);
		lp.CreateLead();
		String lname=eutil.getSingleCellDataFromExcel("Leads", 4, 1);
		String company=eutil.getSingleCellDataFromExcel("Leads", 4, 2);
		String title=eutil.getSingleCellDataFromExcel("Leads", 4, 3);
		String leadsource=eutil.getSingleCellDataFromExcel("Leads", 4, 4);
		String noofemployees=eutil.getSingleCellDataFromExcel("Leads", 4, 5);
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lname,company,title,leadsource,noofemployees);
		System.out.println("New Lead is Created");
		
	}
	
	
}

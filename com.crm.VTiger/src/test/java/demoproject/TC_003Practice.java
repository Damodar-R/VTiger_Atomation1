package demoproject;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactPage;
import objectRepo.CreatingNewLeadPage;
import objectRepo.CreatingnewContact;
import objectRepo.HomePage;
import objectRepo.LeadPage;

public class TC_003Practice extends BaseClass {

	
	@Test
	public void createnewLead2() throws IOException
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadPage lp=new LeadPage(driver);
		lp.CreateLead();
		String lname=eutil.getSingleCellDataFromExcel("Leads", 7, 1);
		String company=eutil.getSingleCellDataFromExcel("Leads", 7, 2);
		String noofemployees=eutil.getSingleCellDataFromExcel("Leads", 7, 3);
		String phone=eutil.getSingleCellDataFromExcel("Leads", 7, 4);
		String email=eutil.getSingleCellDataFromExcel("Leads", 7, 5);
		String state=eutil.getSingleCellDataFromExcel("Leads", 7, 6);
		String country=eutil.getSingleCellDataFromExcel("Leads", 7, 7);
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lname,company,noofemployees,phone,email,state,country);
		System.out.println("New Lead is Created");
		
	}
	
	
}

package demoproject;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactPage;
import objectRepo.CreatingNewLeadPage;
import objectRepo.CreatingnewContact;
import objectRepo.HomePage;
import objectRepo.LeadPage;

public class TC_004Practice extends BaseClass {

	
	@Test(groups="smoke")
	public void createnewContact() throws IOException
	{
		HomePage hp=new HomePage(getDriver());
		hp.clickOnContactsMenu();
		ContactPage cp=new ContactPage(getDriver());
		cp.CreateContact();
		String fname=eutil.getSingleCellDataFromExcel("Contacts", 1, 1);
		String lname=eutil.getSingleCellDataFromExcel("Contacts", 1, 2);
		String title=eutil.getSingleCellDataFromExcel("Contacts", 1, 3);
		CreatingnewContact cnlp=new CreatingnewContact(getDriver());
		cnlp.createNewContact(fname,lname,title);
		System.out.println("New Contact is Created");
		
	}
	
	
}

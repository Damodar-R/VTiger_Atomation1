package demoproject;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactPage;
import objectRepo.CreatingNewLeadPage;
import objectRepo.CreatingnewContact;
import objectRepo.HomePage;
import objectRepo.LeadPage;

public class TC_006Practice extends BaseClass {

	
	@Test
	public void createnewContact2() throws IOException
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactPage cp=new ContactPage(driver);
		cp.CreateContact();
		String lname=eutil.getSingleCellDataFromExcel("Contacts", 7, 1);
		String department=eutil.getSingleCellDataFromExcel("Contacts", 7, 2);
		String email=eutil.getSingleCellDataFromExcel("Contacts", 7, 3);
		String maillingcity=eutil.getSingleCellDataFromExcel("Contacts", 7, 4);
		String maillingstate=eutil.getSingleCellDataFromExcel("Contacts", 7, 5);
		String maillingcountry=eutil.getSingleCellDataFromExcel("Contacts", 7, 6);
		CreatingnewContact cnlp=new CreatingnewContact(driver);
		cnlp.createNewContact(lname,department,email,maillingcity,maillingstate,maillingcountry);
		System.out.println("New Contact is Created");
		
	}
	
}

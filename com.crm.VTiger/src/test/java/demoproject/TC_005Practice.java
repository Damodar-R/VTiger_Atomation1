package demoproject;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactPage;
import objectRepo.CreatingNewLeadPage;
import objectRepo.CreatingnewContact;
import objectRepo.HomePage;
import objectRepo.LeadPage;

public class TC_005Practice extends BaseClass {

	
	@Test
	public void createnewContact1() throws IOException
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactPage cp=new ContactPage(driver);
		cp.CreateContact();
		String lname=eutil.getSingleCellDataFromExcel("Contacts", 4, 1);
		String department=eutil.getSingleCellDataFromExcel("Contacts", 4, 2);
		String title=eutil.getSingleCellDataFromExcel("Contacts", 4, 3);
		String mobile=eutil.getSingleCellDataFromExcel("Contacts", 4, 4);
		CreatingnewContact cnlp=new CreatingnewContact(driver);
		cnlp.createNewContact(lname,department,title,mobile);
		System.out.println("New Contact is Created");
		
	}
	
}

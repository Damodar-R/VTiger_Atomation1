package practice;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactPage;
import objectRepo.CreatingNewLeadPage;
import objectRepo.CreatingnewContact;
import objectRepo.HomePage;
import objectRepo.LeadPage;

public class TC_0011Practice extends BaseClass {

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
	@Test
	public void createnewContact() throws IOException
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactPage cp=new ContactPage(driver);
		cp.CreateContact();
		String fname=eutil.getSingleCellDataFromExcel("Contacts", 1, 1);
		String lname=eutil.getSingleCellDataFromExcel("Contacts", 1, 2);
		String title=eutil.getSingleCellDataFromExcel("Contacts", 1, 3);
		CreatingnewContact cnlp=new CreatingnewContact(driver);
		cnlp.createNewContact(fname,lname,title);
		System.out.println("New Contact is Created");
		
	}
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

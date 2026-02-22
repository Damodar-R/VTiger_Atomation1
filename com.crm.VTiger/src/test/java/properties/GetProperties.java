package properties;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.ExcelUtility;
import genericUtility.propertiesUtility;

public class GetProperties {
	//static String path="C:\\Users\\lenovo\\OneDrive\\Desktop\\data.properties";

	public static void main(String[] args) throws IOException {
		/* FileInputStream fls=new FileInputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\data.properties");
		Properties pr=new Properties();
		pr.load(fls);*/
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get(propertiesUtility.getDataFromProperties("url",path));
		driver.get(ExcelUtility.getSingleCellDataFromExcel("OrangeHRM", 0, 1));
		driver.findElement(By.name("username")).sendKeys(propertiesUtility.getDataFromProperties("username"));
		driver.findElement(By.name("password")).sendKeys(propertiesUtility.getDataFromProperties("password"),Keys.ENTER);
		//FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\lenovo\\\\Desktop\\data.properties");
		//pr.setProperty("email", "damodharr57@gmail.com");
		//pr.store(fos, "email added");
		propertiesUtility.writeDataToProperties("user1", "ram", "ram user created");
		ExcelUtility.writeDataToExcelSheetCell("OrangeHRM", 0, "damodharr58@gmail.com");
		
		System.out.println(propertiesUtility.getDataFromProperties("url"));
		System.out.println(ExcelUtility.getMultipleDataFromExcel( "OrangeHRM", 0, 0));
		driver.quit();

	}

}

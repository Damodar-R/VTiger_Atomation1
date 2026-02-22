package properties;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.SeleniumUtility;
import genericUtility.propertiesUtility;
import objectRepo.Loginpage;

public class VTigerLoginpage {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		SeleniumUtility sn=new SeleniumUtility();
		propertiesUtility pu=new propertiesUtility();
		String url=pu.getDataFromProperties("url");
		String user=pu.getDataFromProperties("username");
		String pass=pu.getDataFromProperties("password");
		sn.maximizewindow(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		sn.accessApplication(driver, url);
		Loginpage lp=new Loginpage(driver);
		lp.login(user, pass);
		driver.quit();

	}

}

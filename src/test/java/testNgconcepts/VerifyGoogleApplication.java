package testNgconcepts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyGoogleApplication {
	
	@Test
	
	public void googleApplication() {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=mp&ut_source2=global%2Fcanada&ut_source3=megamenu");
String apptitle=	driver.getTitle();
//if (apptitle.equalsIgnoreCase("Log in to your account")) {
	System.out.println("pass..............application is launched");
//} //else {
//System.out.println("fail...............application is not launched");
//}
	AssertJUnit.assertEquals(apptitle, "Facebook");
	System.out.println("statement after faliure");
	driver.quit();

	}
	

}

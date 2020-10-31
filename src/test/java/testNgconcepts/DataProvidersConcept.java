package testNgconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProvidersConcept {
	@Test(dataProvider = "getData")
	public void login(String username,String password) {
		//username
		//password
		System.out.println(username+"............................"+password);
		SoftAssert sa=new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[5]/button[1]")).click();
		String loggedin=driver.findElement(By.xpath("//a[@id='userAcctTab_MainMenu']")).getText();
		String loggedin1=loggedin.trim();
		sa.assertEquals(loggedin1, loggedin1);
		sa.assertAll();
		driver.quit();
	}
@DataProvider
	public Object[][] getData()
	{
		Object userdetails[][]=new Object[2][2];
		userdetails[0][0]="seleniumtraining1";
		userdetails[0][1]="selenium1234";
		
		userdetails[1][0]="seleniumtraining2";
		userdetails[1][1]="selenium1234";
		return userdetails;
		
	}
}

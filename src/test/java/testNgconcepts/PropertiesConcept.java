package testNgconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesConcept {
	
	public void login() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\JASKA\\eclipse-workspace\\SeleniumConcepts\\config.properties");
		prop.load(fis);
	String retUsername=	prop.getProperty("username");
	String retPassword= prop.getProperty("password");
	String retType= prop.getProperty("chrome");
	System.out.println(retUsername+"........."+retPassword+"............"+retType);
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("seleniumtraining1");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("selenium1234");
	}

}

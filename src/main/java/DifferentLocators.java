import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
         driver.findElement(By.id("username")).sendKeys("selenium1");
         driver.findElement(By.id("password")).sendKeys("selemium123");
         //xpath
         driver.findElement(By.xpath("//*[@id=\"sign_in_form\"]/fieldset/div/div[5]/button")).click();
	}

}

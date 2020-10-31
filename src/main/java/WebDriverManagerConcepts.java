import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerConcepts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
   
   driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
   WebElement ucid= driver.findElement(By.id("username"));
   System.out.println(driver.getTitle());
   ucid.sendKeys("old value");
   Thread.sleep(2000);
   ucid.clear();
   Thread.sleep(2000);
   ucid.sendKeys("seleniumtraning1");
   Thread.sleep(2000);
   driver.findElement(By.id("password")).sendKeys("selenium1234");
 
 driver.findElement(By.xpath("//*[@id='sign_in_form']/fieldset/div/div[5]/button")).click();
String usernamevalue=	ucid.getAttribute("value");
	
System.out.println("To enter the user name value.......>"+usernamevalue);
System.out.println("Is value is empty"+usernamevalue.isEmpty());
	if (usernamevalue.isEmpty()) {
		System.out.println("value is not entered");
	} else {
System.out.println("value is entered");
	}
	
	}
	

}

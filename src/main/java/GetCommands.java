import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=homepage&ut_source3=megamenu");
		String val=driver.findElement(By.id("username")).getAttribute("value");
		System.out.println("before entering any value........>"+val.isEmpty());
	String title=driver.getTitle();
	System.out.println("The title of the application is:"+title);
		driver.findElement(By.id("username")).sendKeys("oldvalue"); // enter the value in input field.
		Thread.sleep(3000);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("Seleniumtraining1234");
	String usernamevalue=	driver.findElement(By.id("username")).getAttribute("value");
	System.out.println("username value is.......................>"+usernamevalue);
	System.out.println("Is empty value is......."+usernamevalue.isEmpty());
	if (usernamevalue.isEmpty()) {
		System.out.println("value is not entered");
	} else {
System.out.println("value is entered");
	}
//String linkvalue=	driver.findElement(By.linkText("Forgot username or password?")).getText();
//System.out.println("link value is.......................>"+linkvalue);
		
	}

}

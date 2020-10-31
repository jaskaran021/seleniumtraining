import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinkCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		String exceptlink="Forgot username or password?";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		Thread.sleep(2000);
		// 1. clcik on a link
		//driver.findElement(By.linkText("Forgot username or password?")).click();
		// 2. capture the link name
		
	System.out.println(driver.findElement(By.linkText("Forgot username or password?")).getText());
	// 3. capture number of links
	List<WebElement> totallinks=driver.findElements(By.tagName("a"));
	int totalnumberoflinks=totallinks.size();
	System.out.println("count total number of links:"+totalnumberoflinks);
	//4.To print all link names we will use for loop.
	for (int i = 0; i < totalnumberoflinks; i++) {
	String toprintalllinks=	totallinks.get(i).getText();
	System.out.println(toprintalllinks);
	if (toprintalllinks.equalsIgnoreCase(exceptlink)) {
		System.out.println("pass: link is available" );
		break;
	} else {
System.out.println("Fail: link is not available");
	}
	}
	}

}

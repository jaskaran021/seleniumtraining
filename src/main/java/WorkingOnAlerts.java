import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();
		String alerttext=alert.getText();
		System.out.println("to capture the alert value:"+alerttext);
		// clicking on alert button
		Thread.sleep(2000);
		alert.accept();
	}

}

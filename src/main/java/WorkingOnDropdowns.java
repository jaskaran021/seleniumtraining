import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingOnDropdowns {

	public static void main(String[] args) throws InterruptedException {
		
	String	Exptvalue= "Oct";
	boolean status= false;
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[3]/a")).click();
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("month")).sendKeys("jan");
		// using select class
	Select select= new Select(driver.findElement(By.id("month")));
	select.selectByVisibleText("Feb");
	
	Select select2= new Select(driver.findElement(By.id("day")));
	select2.selectByIndex(21);
	Thread.sleep(3000);
	Select select3= new Select(driver.findElement(By.id("year")));
	select3.selectByValue("1991");
	// finding total number of months
List<WebElement> months=	select.getOptions();
	
		System.out.println("To find the total number of months in the field:"+months.size());
		//3. To print all values from month field
		for (int i = 0; i < months.size(); i++) {
			String monthsvalue=months.get(i).getText();
			System.out.println("To print all months value:"+monthsvalue);
			
			if (monthsvalue.equalsIgnoreCase(Exptvalue)) {
				status=true;
				break;
			} else {
              status=false;
			}
			
			if (status==true) {
				System.out.println("pass");
				break;
			} else {
                 System.out.println("fail");
			}
				
			
		}

	}

}

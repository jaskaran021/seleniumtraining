import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
         driver.get("https://www.amazon.ca/");
    List<WebElement>images=driver.findElements(By.tagName("img"));
    System.out.println("Total number of images:"+images.size() );
    for (int i = 0; i < images.size(); i++) {
		System.out.println(" to get the src url:"+images.get(i).getAttribute("src"));
	}
	}

}

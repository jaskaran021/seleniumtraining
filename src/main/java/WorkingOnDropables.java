import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingOnDropables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(2000);
		//switch into frame
		driver.switchTo().frame(0);
		// capturing the draggable text.
	String dragtext=	driver.findElement(By.id("draggable")).getText();
	System.out.println(dragtext);
	//capturing drop text
	 String droptext=driver.findElement(By.id("droppable")).getText();
	 System.out.println(droptext);
	 // Drag and drop
	 Thread.sleep(2000);
	 Actions actions= new Actions(driver);
	 actions.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
	 driver.switchTo().defaultContent();
	 driver.findElement(By.linkText("Selectable")).click();
	 
	}

}

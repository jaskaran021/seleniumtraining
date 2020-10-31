package webDriverConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.ca/");// to open a application
String apptitle=driver.getTitle();
      System.out.println("title of application is;"+apptitle);
      if (apptitle=="Google") {
		System.out.println("google application is opened");
	} else {
        System.out.println("some another appication is opened");
	}
      driver.close();
	}

}

package AZ.AtoZ;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AzonSRC {
	WebDriver driver;
	
  @Test
  public void f() {
	  azhome az=new azhome(driver);
	  az.searchfield();
	  az.searchicon();
	  az.Customerservice();
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoperve\\git\\Automation0431\\Amazon\\src\\Driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

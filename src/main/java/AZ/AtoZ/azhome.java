package AZ.AtoZ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class azhome {
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox") WebElement Search;
	@FindBy(id="nav-search-submit-button") WebElement Searchicon;
	@FindBy(linkText="Customer Service") WebElement Customerservice;
	
	//constructor for page factory
	
		public azhome(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

	// Methods for all functions 
	
		public void searchfield(){
			Search.sendKeys("laptops");
		}
		public void searchicon(){
			Searchicon.click();
		}
		public void Customerservice(){
			Customerservice.click();
		}
}

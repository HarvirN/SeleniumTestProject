package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import static Utilities.Actions.*;


import static org.openqa.selenium.support.PageFactory.initElements;

public class LoginPageFactory {
   WebDriver driver;
   @FindBy(id="Username")
   WebElement username;
   
   @FindBy(id="Password")
   WebElement password;
   
   public LoginPageFactory(WebDriver driver)
   {
	   this.driver = driver;
	   initElements(driver, this);
   }
	
//public WebElement EnterText(WebElement element,String text) {
//		 element.sendKeys(text);
//		 return element;
//}
//
//public WebElement ClickElement(By by) {
//		 WebElement element = driver.findElement(by);
//		 element.click();
//		 return element;
//	  }

public void Login()
{
	  EnterText(username,"hnanuan");
	  EnterText(password,"Password@12345");
	  ClickElement(By.id("Login"), driver);
	  ClickElement(By.id("Login"), driver);
}

}

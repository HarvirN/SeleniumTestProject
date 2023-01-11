package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClassPOM 
{
    By username = By.id("Username");
   By password = By.id("Password");
   WebDriver driver;  

 public LoginClassPOM(WebDriver driver) 
 {
	this.driver = driver;
}

public WebElement EnterText(By by,String text) {
		 WebElement element = driver.findElement(by);
		 element.sendKeys(text);
		 return element;
  }
  
  public WebElement ClickElement(By by) {
		 WebElement element = driver.findElement(by);
		 element.click();
		 return element;
	  }
  
  public void Login()
  {
	  EnterText(username,"hnanuan");
	  EnterText(password,"Password@12345");
	  ClickElement(By.id("Login"));
	  ClickElement(By.id("Login"));
  }
  
  
}




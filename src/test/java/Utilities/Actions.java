package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Actions {
	public static WebElement EnterText(WebElement element,String text) {
		 element.sendKeys(text);
		 return element;
	}

	public static WebElement ClickElement(By by, WebDriver driver) {
		 WebElement element = driver.findElement(by);
		 element.click();
		 return element;
	 }
}

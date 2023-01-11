package SeleniumPractice;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestngclassTest {
	WebDriver driver; 
	
	
	 
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium driver/chromedriver.exe");
		driver = new ChromeDriver();
	     driver.get("https://woundexpert-integration.nhsinc.com");
		// driver.get("https://redoc-integration.nhsinc.com");
	 }

// Login Method	 
	 @Test
	  public void Login() {
		LoginClassPOM log = new LoginClassPOM(driver);
		 log.Login();
	  }	 
	  
	 @Test
	  public void Login1() {
		LoginPageFactory log = new LoginPageFactory(driver);
		 log.Login();
	  }	 
	 
  @Test
  public void Test1() {
	  String currentUrl = driver.getCurrentUrl();
		String newwindowurl = driver.findElement(By.partialLinkText("Click here to see")).getAttribute("href");
		driver.navigate().to(newwindowurl);
		driver.navigate().to(currentUrl);
	//	List<WebElement> a = driver.findElements(By.className("fa fa-comment-o"));
		driver.findElement(By.id("Login")).click();
	 
  }
  
  @Test
  public void Test2() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"left-nav-menu-worklist\"]/a")).click();
	  Thread.sleep(8000);
	  
	  
	 List<WebElement> name = driver.findElements(By.className("worklist-name-values"));
	  
	  for(int i=0;i<name.size();i++) {
		  String elementText = name.get(i).getText(); 
		  System.out.println(elementText); 
	  }
  }

  @Test
  public void Test3() {
	  //driver.findElement(By.xpath("//*[@id=\"lnkSelectColumns\"]")).click();
    List<WebElement> s =  driver.findElement(By.id("FacilityId")).findElements(By.tagName("option"));
	//  List<WebElement> Demo = driver.findElements(By.id("FacilityId"));
//	String Name = Demo.get(1).getText();
	//System.out.println("Name is" +Name );
	
 // String p =  s.get(1).getText();
  // System.out.println(p);
	
   for(int i=0;i<s.size();i++)
   {
	   String Facilityname = s.get(i).getText();
	   System.out.println(Facilityname);
   }
  
  }
  @Test
  public void Test4() 
  {
	  List<WebElement> name = driver.findElements(By.xpath("//*[@id=\"ddlSchedulerFilterPanelCoC\"]/option"));
	  for(int i=name.size(); i>0 ; i--)
	  {
		String Location = name.get(i-1).getText();
		System.out.println(Location);
	  }
  }
  
  
 // Accessing Login by passing driver
  @Test
  public void Test5() throws InterruptedException {
	 driver.findElement(By.xpath("//*[@id=\"left-nav-menu-worklist\"]/a")).click();  
  }
  
  @AfterMethod
  public void afterMethod() {
  }

}

	package defaultpackages;	

			
	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;		
	import org.testng.annotations.Test;	
	import org.testng.annotations.BeforeTest;	
	import org.testng.annotations.AfterTest;		
	public class NewTest {		
		    private WebDriver driver;		
			@Test				
			public void testEasy() {	
				driver.get("http://dixcyscott.biz");  
				String title = driver.getTitle();				 
				Assert.assertTrue(title.contains("DIXCY ::: Order Management System")); 
				System.out.println("Sucess");
			}	
			@BeforeTest
			public void beforeTest() {	
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\workspace\\geckodriver.exe");
			    driver = new FirefoxDriver();  
				System.out.println("  before test Sucess");

			}		
			@AfterTest
			public void afterTest() {
				System.out.println("after test Sucess");

				driver.quit();			
			}		
	}	
		package defaultpackages;	

			
	

	
	
			
	import org.testng.annotations.Test;	
	import org.testng.annotations.BeforeTest;	
	import org.testng.annotations.AfterTest;		
	public class NewTest {		
		   		
			@Test				
			public void testEasy() {	
				 
				System.out.println("Sucess");
			}	
			@BeforeTest
			public void beforeTest() {	
				  
				System.out.println("  before test Sucess");

			}		
			@AfterTest
			public void afterTest() {
				System.out.println("after test Sucess");

							
			}		
	}	

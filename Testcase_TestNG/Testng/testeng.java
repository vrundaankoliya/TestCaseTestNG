 
package Testng;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testeng {
  @Test
  public void openingBrowser()
  {
	  System.out.println("test");
  }
  
  @Test
  public void bookflight()
  {
	  System.out.println("Flightbook");
  }

  
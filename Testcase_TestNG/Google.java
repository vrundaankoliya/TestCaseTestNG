
public class Google{
	private static final String IE_DRIVER_SERVER_LOCATION = "";
	private static final String GOOGLE_HOME_PAGE ="https://accounts.google.com";
	WebDriver driver = null;
	
	@BeforeTest
	private void setupForTest(){
		System.setProperty("webdriver.ie.driver", IE_DRIVER_SERVER_LOCATION);
		driver = new FirefoxDriver();
		driver.get(GOOGLE_HOME_PAGE);
		
	}

@Test
public void testwithSuccessCreateria(){
}

@AfterTest
public void cleanUp(){
	driver.close();
}
}

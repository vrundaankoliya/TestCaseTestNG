
public class Annot2 {

	@Test
	public void Login()
	{
		properties prop = new properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Vrunda Ankoliya\\workspace\\testeng\\Testng\\datadriven.propertie");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		
	}
	
	@Test
	public void software()
	{
		System.out.println("I am the test");
	}
	
	@AfterSuite
	public void deinstallsofteware()
	{
		System.out.println("I am the last");
	}
}
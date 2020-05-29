package StepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDef {
	
	WebDriver driver;
	Logger log = Logger.getLogger(loginStepDef.class);
	
	
	@Given("^User is on Alumini login page$")
	public void user_is_on_Alumini_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Java-Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://alumni.wipro.com/#/Aluminiportalui/");
		log.info("URL is launched");
	    
	}
	
	// Parameterization with Regular expressions

//	@When("^User enters \"(.*?)\" and \"(.*?)\"$")
//	public void user_enters_EmployeeID_and_Password(String userName, String passWord) throws Throwable {
//		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(userName);
//		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(passWord);
//	  
//	}
	
	// Data tables with out header
	
//	@When("^User enters username and password$")
//    public void user_enters_EmployeeID_and_Password(DataTable dataTable) throws Throwable {
//		List<String> dataList = dataTable.asList(String.class);
//		String userName = dataList.get(0);
//		String passWord = dataList.get(1);
// 	driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(userName);
//	driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(passWord);
//	} 
	
	// Data tables with header
//	@When("^User enters username and password$")
//    public void user_enters_EmployeeID_and_Password(DataTable dataTable) throws Throwable {
//	List<Map<String , String>> dataList=dataTable.asMaps(String.class, String.class);
//	String userName = dataList.get(0).get("UserName");
//	String passWord = dataList.get(0).get("Password");
//	driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(userName);
//	driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(passWord);
//	} 
	
	//Examples and scenario outline
	
  @When("^User enters \"(.*?)\" and \"(.*?)\"$")
 public void user_enters_EmployeeID_and_Password(String userName, String passWord) throws Throwable {
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(passWord);
		log.debug("User name and passwords are entered");
		
	  
}


	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[@class='signupbtn bgblue']")).click();
		Thread.sleep(2000);
	   
	}

	@Then("^User should see the home page$")
	public void user_should_see_the_home_page() throws Throwable {
		String welcomeTxt = driver.findElement(By.xpath("//span[@class='pull-left mt23']//h1[@title='Wipro Alumni']")).getText();
		if(welcomeTxt.equals("wipro alumni"))
		{
			System.out.println("User is on Welcome Page: " + welcomeTxt);
		}
		else
		{
		System.out.println("User is not on login page: "+ welcomeTxt);
		
		}
		
		driver.close();
	    	
	}


}

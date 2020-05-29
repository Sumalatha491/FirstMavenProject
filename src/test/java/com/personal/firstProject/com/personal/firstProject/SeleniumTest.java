package com.personal.firstProject.com.personal.firstProject;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.imageio.ImageIO;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver", "E:\\Java-Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(capability);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.softwaretestingmaterial.com/webdriver-driver-new-firefoxdriver/");
		
		driver.navigate().to(arg0);
		System.out.println();
		
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		File filelocation =new File("E:\\Java-Selenium\\screenshot.png");
		FileUtils.copyFile(file, filelocation);
		
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(size);
		
		Robot robot = new Robot();
		BufferedImage image = robot.createScreenCapture(rect);
		ImageIO.write(image, "png", filelocation);
		WebElement element = driver.findElement(By.linkText("Download Excel"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		SoftAssert assert1 = new SoftAssert();
		
		Wait<WebDriver> wait1 = new FluentWait(driver).pollingEvery(Duration.ofSeconds(10)).withTimeout(Duration.ofSeconds(10))
				.ignoring(Exception.class);
		WebElement profile = wait1.until(new Function<WebDriver, WebElement>()
				{
			     public WebElement apply(WebDriver driver)
			     {
			    	return  driver.findElement(By.linkText("Download Excel"));
			     }
				});
	/*	driver.findElement(By.linkText("Download Excel")).click();
		
		File filelocation = new File("C:\\Users\\JOSYA REDDY\\Downloads");
		File[] totalfiles = filelocation.listFiles();
		
		for (File file : totalfiles) {
			
			if(file.getName().equals("testleaf.xlsx"))
			{
				System.out.println("File is downloaded");
				break;
			}
			else
			{
				System.out.println("Problem with downloading");
			}
		}
		*/
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,450)", "");
		
		Thread.sleep(3000);
		System.out.println("scroll down");		
		js.executeScript("window.scroll(0,-450)", "");
		Thread.sleep(3000);
		System.out.println("scroll up");
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		Thread.sleep(3000);
		System.out.println("scroll down");
		js.executeScript("window.scroll(0,0)", "");
		Thread.sleep(3000);
		System.out.println("scroll up");

	}

}

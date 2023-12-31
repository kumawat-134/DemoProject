package DemoIntegrationProject.demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	WebDriver driver;

@BeforeMethod
public void launchBrowser()
{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	System.out.println("broswer is laumched");
	
}
@Test
public void Test1()
{
	driver.navigate().to("https://www.AutomationTalks.com");
	System.out.println("Tes1 method is executed");
}

@Test
public void Test2()
{
	driver.navigate().to("https://www.AutomationTalks.com");
	System.out.println("Tes2 method is executed");
}

@Test
public void Test3()
{
	driver.navigate().to("https://www.AutomationTalks.com");
	System.out.println("Tes3 method is executed");
}

@AfterMethod
public void Test4()
{
	driver.quit();
}





}

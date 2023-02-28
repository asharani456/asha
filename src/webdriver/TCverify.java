package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TCverify {
	public static void main(String args[]) throws Exception{
	    //Test Steps
	System.setProperty("webdriver.chrome.driver",
			"C:\\SeleniumData\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	//Verify Page Title
	//Actual Result     compare ExpectedResult
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
	   System.out.println("Title matched");    
	}
	else {
	    System.out.println("Title not matched");
	    System.out.println(driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login comleted");
	Thread.sleep(4000);
	//Verify Page Title
	if(driver.getTitle().equals("OrangeHRM")) {
	   System.out.println("Title matched");    
	}
	else {
	    System.out.println("Title not matched ");
	    System.out.println(driver.getTitle());
	}
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	Thread.sleep(3000);
	driver.close();
	}
	}
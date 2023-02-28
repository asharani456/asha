package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_Frame {
	public static void main(String args[]) throws Exception{
	    //Test Steps
	System.setProperty("webdriver.chrome.driver",
					"C:\\SeleniumData\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	Thread.sleep(4000);
	//Enter into Frame
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
	System.out.println("Clicked on Add btn");
	Thread.sleep(3000);
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
	driver.findElement(By.name("txtEmpLastName")).sendKeys("suresh");
	driver.findElement(By.id("btnEdit")).click();
	System.out.println("New Emp Added");
	Thread.sleep(3000);
	//exit from frame
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.close();
	}
}

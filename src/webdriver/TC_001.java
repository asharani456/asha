package webdriver;
import org.openqa.selenium.WebDriver;
//to access firefox browser
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//to access object Ind: methods
import org.openqa.selenium.By;
//to access firefox browser
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//to access object Ind: methods
import org.openqa.selenium.By;
public class TC_001 {
	public static void main(String args[]) throws Exception{
	    //Test Steps
	System.setProperty("webdriver.chrome.driver",
			"C:\\SeleniumData\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000); //wait for some time
	driver.close();
	}
	}

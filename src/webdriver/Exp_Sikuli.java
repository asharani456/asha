package webdriver;
import org.sikuli.script.Screen;

public class Exp_Sikuli {
	public static void main(String args[]) throws Exception{
	    //Test Steps
	    Screen sc = new Screen();
	    Thread.sleep(3000);
	    sc.click("C:\\SeleniumData\\max.png");
	    Thread.sleep(3000);
	    sc.doubleClick("C:\\SeleniumData\\minimize.png");
	    Thread.sleep(3000);
	    sc.click("C:\\SeleniumData\\close.png");
	    Thread.sleep(3000);
	    sc.doubleClick("C:\\SeleniumData\\arr.png");
	   
	   
	}
}

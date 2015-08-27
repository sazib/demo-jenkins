import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class Test {
	public static void main(String [] args){
		/*WebDriver driver = new SafariDriver();
		System.out.println("Firefox is opening....");
		driver.get("http://google.com");*/
		new Test().testMethod();
	}
	
	@org.testng.annotations.Test
	public void testMethod(){
		System.out.println("This is a test method only.");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");                  
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new SafariDriver();
		driver.get("http://google.com");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		//String selectAll = Keys.chord(Keys.CONTROL,"t");
		//driver.findElement(By.tagName("html")).sendKeys(selectAll);
		//Actions actions = new Actions(driver);
		//actions.sendKeys(selectAll).perform();
		
		/*Robot r = null;
		try {
			r = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);*/
		
		System.out.println(driver.getWindowHandles().size());
		
		/*for(String s : driver.getWindowHandles())
			driver.switchTo().window(s);
		
		driver.get("https://gmail.com");*/
		
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("function createDoc(){var w = window.open(); w.document.open(); w.document.write('<h1>Hello World!</h1>'); w.document.close();}; createDoc();");
		//jse.executeScript("window.open('https://google.com','_blank')");
		//jse.executeScript("$(window).keydown(function(event){console.log(event.keyCode);event.preventDefault();});");
	}
}

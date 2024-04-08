package ABC;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	     driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	     driver.findElement(By.cssSelector("a.blinkingText")).click();
	     Set<String> windows=driver.getWindowHandles();
	     Iterator<String> it=windows.iterator();
	     String Parentid= it.next();
	     String Childid= it.next();
	     driver.switchTo().window(Childid);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".im-para.red")));
	    System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	    driver.findElement(By.cssSelector(".im-para.red")).getText();
	   
	    String emailid=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	    driver.switchTo().window(Parentid);
	    driver.findElement(By.id("username")).sendKeys(emailid);
	}

}

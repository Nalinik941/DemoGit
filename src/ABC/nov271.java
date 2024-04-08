package ABC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class nov271 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.gecko.driver","C://Users//Dell//Documents//geckodriver.exe" );
     WebDriver driver=new FirefoxDriver();
     String name="rahul";
     String Password=getpassword(driver);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.get("https://rahulshettyacademy.com/locatorspractice/");
     driver.findElement(By.id("inputUsername")).sendKeys(name);
     driver.findElement(By.name("inputPassword")).sendKeys(Password);
     Thread.sleep(1000);
     driver.findElement(By.className("signInBtn")).click();
     Thread.sleep(1000);
     System.out.println(driver.findElement(By.tagName("p")).getText());
     Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
     Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
     driver.findElement(By.className("logout-btn")).click();
	}
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
	   driver.findElement(By.linkText("Forgot your password?")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.className("reset-pwd-btn")).click();
	   System.out.println( driver.findElement(By.className("infoMsg")).getText());
	   String Passwordtext=driver.findElement(By.className("infoMsg")).getText();
	   String[] Passwordarray=Passwordtext.split("'");
	   String password=Passwordarray[1].split("'")[0];
	   return password;
	   
	}
     }

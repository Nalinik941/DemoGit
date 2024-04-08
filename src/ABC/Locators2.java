package ABC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name="Rahul";
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C://Users//Dell//Documents//msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String Password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(Password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in." );
       Assert.assertEquals( driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello "+name+",");
       driver.findElement(By.xpath("//button[text()='Log Out']")).click();
       driver.close();
			}
 
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='reset']")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        String PasswordText=driver.findElement(By.cssSelector("form p")).getText();
        String[] PasswordArray=PasswordText.split("'");
        String Password1=PasswordArray[1].split("'")[0];
        return Password1;
	}
	
}

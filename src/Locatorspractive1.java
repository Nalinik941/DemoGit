import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locatorspractive1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String name="Rahul";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("inputUsername")).sendKeys("nalini");
		driver.findElement(By.name("inputPassword")).sendKeys("1234");
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.cssSelector("p.error")).getText();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Nalu");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("form input:nth-child(4)")).sendKeys("1234567890");
		driver.findElement(By.xpath("//form/input[3]")).clear();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Phone')]")).sendKeys("9876543210");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		String password=getpassword(driver);
		//driver.close();
		Thread.sleep(1000);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(2000);
	   System.out.println( driver.findElement(By.tagName("p")).getText());
	   Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	  Assert.assertEquals(driver.findElement(By.xpath("//div/h2")).getText(),"Hello "+name+",");
		driver.findElement(By.tagName("button")).click();
		driver.close();
		

	}
  public static String getpassword(WebDriver driver) throws InterruptedException
  {
	  driver.get("https://rahulshettyacademy.com/locatorspractice/");
	  driver.findElement(By.linkText("Forgot your password?")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.className("reset-pwd-btn")).click();
	  String Passwordtext=driver.findElement(By.cssSelector("form p")).getText();
	  String[] Passwordarray=Passwordtext.split("'");
	  String Password=Passwordarray[1].split("'")[0];
	  return Password;
	  
	  
  }
  
}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   String Password=getpassword(driver);
   driver.get("https://rahulshettyacademy.com/locatorspractice/");
   driver.findElement(By.id("inputUsername")).sendKeys("rahul");
   driver.findElement(By.name("inputPassword")).sendKeys("124");
   driver.findElement(By.className("signInBtn")).click();
   driver.findElement(By.linkText("Forgot your password?")).click();
   Thread.sleep(2000);
   driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("nalini");
   driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("1234");
   driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
   driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("12345");
   driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");
   driver.findElement(By.cssSelector("form input:nth-child(4)")).clear();
   driver.findElement(By.cssSelector("input[type*='tex']:nth-child(4)")).sendKeys("0987654321");
   driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
   driver.findElement(By.xpath("//form/p")).getText();
   driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();
   Thread.sleep(2000);
   driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
   driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("Password");
   driver.findElement(By.className("submit")).click();
   driver.close();
   
	}


 public static String getpassword(WebDriver driver) throws InterruptedException
 {
	 driver.get("https://rahulshettyacademy.com/locatorspractice/");
	 driver.findElement(By.linkText("Forgot your password?")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	 String Passwordtext=driver.findElement(By.xpath("//form/p")).getText();
	 String[] PasswordArray=Passwordtext.split("'");
	 String password=PasswordArray[1].split("'")[0];
	 return password;
	 
	 
 }
 }

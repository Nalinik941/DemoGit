import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Users//Dell//Documents//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("1234");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("nalini");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("nalini@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/input[2]")).sendKeys("nalini@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("1234567890");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(2000);
		System.out.println( driver.findElement(By.cssSelector(".infoMsg")).getText());
		System.out.println( driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(5000);
		System.out.println( driver.findElement(By.xpath("//div[contains(@class,'container')]")).getText());
		driver.close();

		
		

	}

}

package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
        System.out.println (driver.getCurrentUrl());
        System.out.println (driver.getTitle());
        driver.findElement(By.cssSelector("input[class='_18u87m _3WuvDp']")).sendKeys("123456789");
        driver.findElement(By.cssSelector("button[class='_1wGnMD rX1XT4 _2nD2xJ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("New to Flipkart? Create an account")).click();
        driver.findElement(By.linkText("Existing User? Log in")).click();
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("iphone");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[class='L0Z3Pu']")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("_4rR01T")).click();
        // driver.findElement(By.cssSelector("button[class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
        driver.close();
        
	}

}
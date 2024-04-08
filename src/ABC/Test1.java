package ABC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Dell//Documents//chromedriver-win64//chromedriver.exe");
		/*--ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");--*/
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("1234");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("nalini");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("nalini@gmail.com");
        driver.findElement(By.cssSelector("form input:nth-child(3)")).clear();
        driver.findElement(By.xpath("//form/input[2]")).sendKeys("nalini@gmail.com");
        driver.findElement(By.xpath("//form/input[@type='text'][3]")).sendKeys("1234567890");
        driver.findElement(By.cssSelector("button[class*='reset']")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.signInBtn")).click();
        System.out.println( driver.findElement(By.cssSelector("div[class*='login']")).getText());
        driver.close();
	}

}

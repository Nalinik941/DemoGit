package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="nalini";
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	     driver.findElement(By.id("name")).sendKeys(text);
	     driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
	     System.out.println(driver.switchTo().alert().getText());
	     driver.switchTo().alert().accept();
	     driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
	     System.out.println(driver.switchTo().alert().getText());
	     driver.switchTo().alert().dismiss();
	     
	}

}

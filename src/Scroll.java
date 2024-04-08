import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	   List<WebElement> Values=	driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
	   int Sum=0;
	   for(int i=0;i<Values.size();i++)
	   {
		Sum=Sum+Integer.parseInt(Values.get(i).getText());
	   }
	   System.out.println(Sum);
	   driver.findElement(By.cssSelector(".totalAmount")).getText();
	  int Actual= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	  Assert.assertEquals(Sum, Actual);
	}

}

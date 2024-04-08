package e2e;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array= {"Cauliflower","Beetroot"};
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
	     driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	     additem(driver,array);
	     driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	     driver.findElement(By.xpath("//button[contains (text(),  'PROCEED TO CHECKOUT')]")).click();
	     w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
	     driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
	     driver.findElement(By.cssSelector(".promoBtn")).click();
	     w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	     
	     
	}
	public static void additem(WebDriver driver,String[] array) {
		int j=0;
	List<WebElement> items=driver.findElements(By.cssSelector(".product-name"));
	for(int i=0;i<items.size(); i++)
	{
		String[] name=items.get(i).getText().split("-");
		String name2=name[0].trim();
		List a=Arrays.asList(array);
		if(a.contains(name2))
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
			if(j==array.length)
			{
				break;
			}
		}
	}
	}
}

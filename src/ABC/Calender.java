package ABC;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriverWait d=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@for='departure']/span")).click();
        
        while(!driver.findElement(By.cssSelector("div[class='DayPicker-Month'] [class='DayPicker-Caption']")).getText().contains("April"))
        {
        	driver.findElement(By.cssSelector("span[tabindex='0']:nth-child(2)")).click();
        }
		int count=driver.findElements(By.className("DayPicker-Day")).size();
		List<WebElement> date=driver.findElements(By.className("DayPicker-Day"));
		for(int i=0; i<date.size(); i++)
		{
		  String text=date.get(i).getText();
		  if(text.contains("29"))
		  {
			  date.get(i).click();
			  break;
		  }
		}
	}

}

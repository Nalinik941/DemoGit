import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    System.out.println(driver.findElements(By.tagName("a")).size());
	  WebElement footer= driver.findElement(By.id("gf-BIG"));//Limiting Webdriver scope
	 System.out.println(footer.findElements(By.tagName("a")).size());
	 WebElement column= footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	 System.out.println(column.findElements(By.tagName("a")).size());

	 for(int i=1; i<column.findElements(By.tagName("a")).size(); i++)
	 {
		String key= Keys.chord(Keys.CONTROL,Keys.ENTER);
		 column.findElements(By.tagName("a")).get(i).sendKeys(key);
		Thread.sleep(5000);

	 }
	 Set<String> windows= driver.getWindowHandles();
	    Iterator<String> it=	windows.iterator();
	    while(it.hasNext())
	    {
	    	driver.switchTo().window(it.next());
	    	System.out.println(driver.getTitle());
	    }
	}

}

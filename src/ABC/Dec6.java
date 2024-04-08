package ABC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	     driver.findElement(By.id("autosuggest")).sendKeys("ame");
	     Thread.sleep(2000);
	     List<WebElement> Options=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
	     for(WebElement option:Options)
	     {
	    	 if(option.getText().equals("Cameroon"))
	    	 {
	    		 option.click();
	    		 break;
	    	 }
	     }
	}

}

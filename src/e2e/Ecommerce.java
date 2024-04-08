package e2e;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int j=0;
		String[] Items= {"Cucumber","Beans","Carrot","Pumpkin"};
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	     Thread.sleep(3000);
	    List<WebElement> listItems=driver.findElements(By.cssSelector("h4.product-name"));
	    for(int i=0; i<listItems.size(); i++)
	    {
	    	String[] name=listItems.get(i).getText().split("-");
	    	String name1=name[0].trim();
	    	List name2 = Arrays.asList(Items);
	    	if(name2.contains(name1))
	    	{
	    		j++;
	    		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
	    		if(j==Items.length)
	    		{
	    			break;
	    		}
	    	}
	    }
	}

	
}

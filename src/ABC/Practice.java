package ABC;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	   driver.findElement(By.xpath("//div[@id=\"checkbox-example\"]/fieldset/label[2]")).click();
	   String  opt=driver.findElement(By.xpath("//div[@id=\"checkbox-example\"]/fieldset/label[2]")).getText();
	   WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
	   Select staticdropdown=new Select(dropdown);
	   staticdropdown.selectByVisibleText(opt);
	   driver.findElement(By.id("name")).sendKeys(opt);
	   driver.findElement(By.id("alertbtn")).click();
	   Thread.sleep(1000);
	   String text=driver.switchTo().alert().getText();
	   
	   if(text.contains(opt))
	   {
		   System.out.println("successful");
	   }
	   else
	   {
		   System.out.println("Unsuccess");
	   }
       



		

	}

}

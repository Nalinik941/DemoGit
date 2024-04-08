package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://corporate.spicejet.com/Default.aspx");
	     Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	     //System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
         driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
         Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
         //System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        // System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
         Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 9);
         Thread.sleep(2000);
         driver.manage().window().maximize();
         System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
         driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
         System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
         if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
         {
        	// System.out.println("Its Enabled");
        	 Assert.assertTrue(true);
         }
         else
         {
        	 //System.out.println("its desabled");
        	 Assert.assertTrue(false);
         }
	}

}

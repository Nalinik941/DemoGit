package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://corporate.spicejet.com/Default.aspx");
	     //driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	     driver.findElement(By.xpath("//a[@value='AGR']")).click();
	     Thread.sleep(2000);
	    // driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
	     driver.findElement(By.xpath("(//td[@class='mapbg'])[2] //a[@value='DEL']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	     driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	     Thread.sleep(1000);
	     System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	     if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
	     {
	    	 System.out.println("its disabled");
	    	 Assert.assertTrue(true);
	     }
	     else
	     {
	    	 System.out.println("Its Enabled");
	    	 Assert.assertTrue(false);
	     }
	     driver.findElement(By.id("divpaxinfo")).click();
	 WebElement StaticDropdown= driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
	 Select dropdown=new Select(StaticDropdown);
	 dropdown.selectByValue("5");
	 System.out.println(dropdown.getFirstSelectedOption().getText());
	 driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
	 WebElement StaticDropdown2=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	 Select dropdown2=new Select(StaticDropdown2);
	 dropdown2.selectByVisibleText("BDT");
	 System.out.println(dropdown2.getFirstSelectedOption().getText());
	 driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	 
	}

}

package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec41 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://corporate.spicejet.com/Default.aspx");
     Thread.sleep(2000);
     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
     driver.findElement(By.xpath("//a[@value='BLR']")).click();
     //driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='AMD']")).click();
     Thread.sleep(2000);
     driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	}

}

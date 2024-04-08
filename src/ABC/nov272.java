package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class nov272 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Users//Dell//Documents//geckodriver.exe" );
	     WebDriver driver=new FirefoxDriver();
         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
         System.out.println(driver.findElement(By.xpath("//header/div/button[2]/parent::div/button[1]")).getText());
         System.out.println(driver.findElement(By.xpath("//header/div/button[2]/following-sibling::button[1]")).getText());
         System.out.println(driver.findElement(By.xpath("//header/div/button[3]/parent::div/button[2]")).getText());
         driver.close();

	}

}

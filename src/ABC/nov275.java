package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nov275 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for(int i=1;i<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.className("buttonN")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		int j=5;
		while (j>1)
		{
			driver.findElement(By.id("hrefDecAdt")).click();
			j--;
			
		}
		driver.findElement(By.className("buttonN")).click();
	}

}

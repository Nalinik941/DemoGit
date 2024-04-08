import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String item="Guava";
		driver.findElement(By.id("search-field")).sendKeys(item);
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> veggie=veggies.stream().filter(s->s.getText().contains(item)).collect(Collectors.toList());
		Assert.assertEquals(veggies.size(), veggie.size());

	}

}

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> Veggi=driver.findElements(By.xpath("//tr/td[1]"));
		List<String> veggies=Veggi.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sort=veggies.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(veggies.equals(sort));
		List<String> price;
		do
		{
			List<WebElement> Veggi1=driver.findElements(By.xpath("//tr/td[1]"));
		    price=Veggi1.stream().filter(s->s.getText().contains("Rice")).map(s->getpriceveggi(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
			if(price.size()<1)
			{
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
			
		}while(price.size()<1);


		
		
		
	}

	private static String getpriceveggi(WebElement s) {
	
		String a=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return a;
	}

}

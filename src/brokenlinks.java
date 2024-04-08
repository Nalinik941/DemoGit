import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenlinks {

	

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='gf-BIG']")));
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F://screenshot.png"));
//	String url=	driver.findElement(By.xpath("//a[contains(@href,'brokenlink')]")).getAttribute("href");
//		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int Resp=conn.getResponseCode();
//		System.out.println(Resp);
		
		List<WebElement> Linkscount= driver.findElements(By.xpath("//li[@class='gf-li']/a"));
//		for(WebElement link : Linkscount)
//		{
//			String url=link.getAttribute("href");
//			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
//			conn.setRequestMethod("HEAD");
//			conn.connect();
//			int Resp=conn.getResponseCode();
//			if(Resp>400)
//			{
//				System.out.println("The link with text"+link.getText()+"is broken with code"+Resp);
//				Assert.assertTrue(false);
//			}
	//	}
		
		SoftAssert a=new SoftAssert();
		for (WebElement link:Linkscount)
		{
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int count=conn.getResponseCode();
			System.out.println(count);
			a.assertTrue(count<400,"The link with text"+link.getText()+"is broken with code"+count);
		}
			a.assertAll();
		}
	}



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.gecko.driver", "C://Users//Dell//Documents//geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
     WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
     Select dropdown=new Select(staticdropdown);
     dropdown.selectByIndex(3);
     System.out.println(dropdown.getFirstSelectedOption().getText());
     dropdown.selectByValue("INR");
     System.out.println(dropdown.getFirstSelectedOption().getText());
     dropdown.selectByVisibleText("AED");
     System.out.println(dropdown.getFirstSelectedOption().getText());
     }

}

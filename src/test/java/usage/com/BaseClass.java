package usage.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver launchFirefox() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		return driver;

	}

	public void launchUrl(WebDriver driver, String url) {
		driver.get(url);

	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);

	}
	
	public void btnclick(WebElement element) {
		element.click();

	}
	
	public void quitBrowser(WebDriver driver) {
		driver.quit();

	}
	
	public String getPageUrl(WebDriver driver) {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public String getPageTitle(WebDriver driver) {
		String pagetitle = driver.getTitle();
		return pagetitle;

	}

}

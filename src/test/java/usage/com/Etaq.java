package usage.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Etaq extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		BaseClass obj = new BaseClass();
		
		WebDriver driver = obj.launchFirefox();
		obj.launchUrl(driver, "https://etaq.sensiple.com/");
		System.out.println(obj.getPageUrl(driver));
		WebElement btnclk = driver.findElement(By.xpath("//button[@type='button']"));
		obj.btnclick(btnclk);
		Thread.sleep(2000);
		obj.quitBrowser(driver);
		 
		
	}

}

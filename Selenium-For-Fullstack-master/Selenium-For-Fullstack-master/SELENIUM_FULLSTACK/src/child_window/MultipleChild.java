package child_window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// close only flipkart window

public class MultipleChild {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/14");
		Thread.sleep(40000);
		//click on compare button
		driver.findElement(By.xpath
("//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj']")).click();
		//fetch pwid
		String pwid = driver.getWindowHandle();
		//fetch allwids
		Set<String> allWids = driver.getWindowHandles();
		for (String wid : allWids) {
			driver.switchTo().window(wid);
			String cUrl = driver.getCurrentUrl();
			if (cUrl.contains("flipkart")) {
				driver.close();
			}
		}
	}

}

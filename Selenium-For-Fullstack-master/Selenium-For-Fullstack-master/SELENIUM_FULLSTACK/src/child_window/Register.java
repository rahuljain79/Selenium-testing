package child_window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		// fetch parent wid
		String pwid = driver.getWindowHandle();
		// click on open new window button
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(2000);
		// fetch all wids
		Set<String> allWids = driver.getWindowHandles();
		for (String wid : allWids) {
			if (wid.equals(pwid)) {
			}else {
				driver.switchTo().window(wid);
				driver.manage().window().maximize();
			}
		}
		//first name
		driver.findElement(By.id("firstName")).sendKeys("AAAAAA");
	}

}

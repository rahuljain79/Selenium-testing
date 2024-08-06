package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Radio {
	
	//to verify user can able to choose radio buttons
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		//click on female radio button
		driver.findElement(By.cssSelector("input[value='1']")).click();
		//click on male radio button
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='2']")).click();
		//click on custom radio button
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='-1']")).click();
		
	}

}

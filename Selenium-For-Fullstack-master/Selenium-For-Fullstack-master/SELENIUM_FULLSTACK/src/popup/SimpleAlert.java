package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
impWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);ort org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	public static void main(String[] args) throws InterruptedException {
		
		//click on click for js alert button
		driver.findElement(By.xpath
				("//button[text()='Click for JS Alert']")).click();
		//handle an alert
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		//fetch alert message
		System.out.println(alt.getText());
		//handle by clicking ok
		alt.accept();
		
		//with out handling an alert if i performs any action?
		driver.findElement(By.xpath
				("//button[text()='Click for JS Confirm']")).click();
	}

}

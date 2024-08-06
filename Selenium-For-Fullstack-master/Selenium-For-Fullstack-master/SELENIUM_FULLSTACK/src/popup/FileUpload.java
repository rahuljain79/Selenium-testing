package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		//identify choose file
		Thread.sleep(3000);
		WebElement fileUpload = driver.findElement(By.id("file-upload"));
		fileUpload.sendKeys
("C:\\Users\\vijay\\TRAINING\\SELENIUM_FULLSTACK\\file\\Pattern3.java");
		//click on upload button
		driver.findElement(By.id("file-submit")).click();
	}

}

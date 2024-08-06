package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Radiobutton {
	//syntax
	//xpath by complete text
			// //tagname[text()='complete text']
	//xpath by partial text
			// //tagname[contains(text(),'visible text')]
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//choose excellent
		driver.findElement(By.xpath("//label[text()='Excellent']")).click();
		//choose good
		driver.findElement(By.xpath("//label[contains(text(),'Go')]")).click();
		//choose poor
		driver.findElement(By.xpath("//label[contains(text(),'Poor')]")).click();
		//choose bad
		driver.findElement(By.xpath("//label[text()='Very bad']")).click();
	}

}

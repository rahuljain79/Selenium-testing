package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Useof_Linktext {
	//what is link text?
		//a text which is associated with <a> tag is called "link text"
		//so By.linkText() and By.partialLinkText() applicable only for <a>
	
	//By.linkText()-->we should pass entire value of linktext
	
	//By.partialLinkText()-->we can pass complete linktext as well as
				//we can pass any portion of the link text
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//click on login link
		//driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.partialLinkText("Log i")).click();
		
	}

}

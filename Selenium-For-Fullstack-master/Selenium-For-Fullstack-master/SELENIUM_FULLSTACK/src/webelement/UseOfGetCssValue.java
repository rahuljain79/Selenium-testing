package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetCssValue {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//getAttribute()
		WebElement login = driver.findElement(By.name("login"));
		//text color
		String textColor = login.getCssValue("color");
		System.out.println(textColor);
		//background color/element color
		String elementColor = login.getCssValue("background-color");
		System.out.println(elementColor);
		//font
		String font = login.getCssValue("font");
		System.out.println(font);
		//font-family
		String ff = login.getCssValue("font-family");
		System.out.println(ff);
		//quit
		driver.quit();
	}

}

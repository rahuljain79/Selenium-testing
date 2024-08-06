package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size_Position {

	// getSize()-->public Dimension(c) getSize()
	// used to fetch height and width of the web page
	//return type is Dimension class
	// driver.manage().window().getSize();

	// getPosition()-->public Point(c) getPosition()
	// used to fetch x and y co_ordinate
	//return type is Point class
	// driver.manage().window().getPosition()

	public static void main(String[] args) {
		// launch browser
		WebDriver driver = new ChromeDriver();
		// maximize
		//driver.manage().window().maximize();
		//access fb
		driver.get("https://www.facebook.com/");
		//get size
		Dimension size = driver.manage().window().getSize();
		System.out.println("size-->"+size);
		System.out.println(size.height);
		System.out.println(size.width);
		//get position
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println(position.x);
		System.out.println(position.y);
		//quit
		driver.quit();
	}

}

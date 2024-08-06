package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Size_Position {

	// setSize()-->public void setSize()
	// used to set the size of a window

	// setPosition()-->public void setPosition()
	// used to set the position

	public static void main(String[] args) throws InterruptedException {

		// launch browser
		WebDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		//set the size
//		Dimension d=new Dimension(100, 100);
//		driver.manage().window().setSize(d);
		//set the position
		Point p=new Point(20, 20);
		driver.manage().window().setPosition(p);
		
	}

}

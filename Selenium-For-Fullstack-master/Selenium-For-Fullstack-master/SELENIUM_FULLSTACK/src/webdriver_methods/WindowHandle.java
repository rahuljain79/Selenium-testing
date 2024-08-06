package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	//getWindowHandle()-->public String getWindowHandle()
	//it is used to fetch window id-->only one window id-->parent id
	//syntax-->driver.getWindowHandle()
	
	//getWindowHandles()-->public Set<String> getWindowHandles();
	//it is used to fetch all the window ids-->parent+all child ids
	//syntax-->driver.getWindowHandles()
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//fetch parent id
		String wid = driver.getWindowHandle();
		System.out.println(wid);
		//click on open new window button
		driver.findElement(By.id("newWindowBtn")).click();
		//fetch all window ids
		Set<String> allIds = driver.getWindowHandles();
		for (String id : allIds) {
			System.out.println(id);
		}
		driver.quit();
	}

}

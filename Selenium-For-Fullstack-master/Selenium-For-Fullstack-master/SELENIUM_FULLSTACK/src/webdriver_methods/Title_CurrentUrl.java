package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_CurrentUrl {
	//2-->getTitle()
	//public String getTitle()
	//used to fetch title of the current webpage
	//syntax-->driver.getTitle()
	
	//3-->getCurrentUrl()
	//public String getCurrentUrl()
	//used to fetch url of the current webpage
	//syntax-->driver.getCurrentUrl()
	public static void main(String[] args) {
		//launch browser
		WebDriver driver=new ChromeDriver();
		//access fb
		driver.get("https://www.facebook.com/");
		//fetch title
		String title = driver.getTitle();
		System.out.println("TITLE-->"+title);
		//fetch c.url
		String cUrl = driver.getCurrentUrl();
		System.out.println("C.URL-->"+cUrl);
	}

}

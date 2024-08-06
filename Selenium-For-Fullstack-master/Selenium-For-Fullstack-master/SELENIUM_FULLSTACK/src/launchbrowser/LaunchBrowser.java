package launchbrowser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		//to launch browser we need to create
			//an obj for browser specific class
		
		//new ChromeDriver();
		//new EdgeDriver();
		//new InternetExplorerDriver();
		
		//exact syntax to launch browser
		WebDriver driver=new ChromeDriver();
		//we can launch all browsers
		//-->we can access 11+2 methods
		//we can achieve abstraction
	}

}

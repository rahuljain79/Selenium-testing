package dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Price {
	//to fetch current price in flipkart
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/apple-iphone-15-green-128-gb/p/itm235cd318bde73?pid=MOBGTAGPYYWZRUJX&lid=LSTMOBGTAGPYYWZRUJXUGY7PM&marketplace=FLIPKART&q=iphones&store=tyy%2F4io&spotlightTagId=FkPickId_tyy%2F4io&srno=s_1_1&otracker=AS_Query_HistoryAutoSuggest_1_1_na_na_na&otracker1=AS_Query_HistoryAutoSuggest_1_1_na_na_na&fm=search-autosuggest&iid=ac76fa09-40b4-458d-aca2-0fe2aa2e4425.MOBGTAGPYYWZRUJX.SEARCH&ppt=sp&ppn=sp&ssid=kb5qu6m4800000001719920802153&qH=3e7fa8c51e2e4986");
		Thread.sleep(3000);
		//fetch current price
		WebElement CurrentPrice = driver.findElement(By.xpath
		("//span[text()='Apple iPhone 15 (Green, 128 GB)']/../../../div[4]/div[1]/div/div[1]"));
		System.out.println(CurrentPrice.getText());
		//fetch actal price
		WebElement actualPrice = driver.findElement(By.xpath
		("//span[text()='Apple iPhone 15 (Green, 128 GB)']/../../../div[4]/div[1]/div/div[2]"));
		System.out.println(actualPrice.getText());
		//fetch offer percentage
		WebElement offer = driver.findElement(By.xpath
		("//span[text()='Apple iPhone 15 (Green, 128 GB)']/../../../div[4]/div[1]/div/div[3]"));
		System.out.println(offer.getText());
		//quit
		driver.quit();
	}

}

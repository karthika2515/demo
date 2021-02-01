package org.base;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	public static Select s;
	public static Actions a;
	public static WebDriver driver;
	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika Suresh\\eclipse-workspace\\Project\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void maxBrowser() {
		driver.manage().window().maximize();
	
	}
	public static void navigate() {
		driver.navigate().back(); 
	}
	public static void pageTitle() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	public static void type(WebElement e, String value) {
		e.sendKeys(value);
		
	}
	public static void btnclick(WebElement element) {
		element.click();
	}
	public static void pageUrl() {
		String url =driver.getCurrentUrl();
		System.out.println(url);
	}
	static public void selectByVisibleText(WebElement element,  String data) {
			Select select = new Select(element);
			select.selectByVisibleText(data);
	}
	public static void clickDouble(WebElement ref,WebElement src,WebElement des) {
		a=new Actions(driver);
		a.doubleClick(ref).perform();
		a.dragAndDrop(src,des);
		
	}
	public static void rightClick(WebElement element) {
		a.contextClick(element).perform();
		}
	public static void isDisplayed(WebElement e, boolean  b) {
		e.isDisplayed();
	}
	public static void isEnabled(WebElement e, boolean  b) {
		e.isEnabled();
	}
	public static void dropDown(WebElement e){
		s=new Select(e);
		e.click();
	}
/* public static List<WebElement> list(WebElement element,  String tagName) {
			List<WebElement> li = element.findElements(By.tagName(tagName));
			return li;*/
	}
	
	

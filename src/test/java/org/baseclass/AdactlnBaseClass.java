package org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactlnBaseClass {
	public static WebDriver driver;
	public static WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();
	}
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void implicitWait(int secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);

	}
	public static void sendkeys(WebElement e,String st) {
		e.sendKeys(st);
	}
	public static void click(WebElement e) {
		e.click();
	}
	public static void close() {
		driver.quit();

	}
	public static void selectByValue(WebElement e,String str) {
		Select s=new Select(e);
		s.selectByValue(str);	
	}
	public static void selectByIndex(WebElement e,int i) {
		Select s=new Select(e);
		s.selectByIndex(i);
	}
	public static void selectByVisibleText(WebElement e,String str) {
		Select s=new Select(e);
		s.selectByVisibleText(str);
	}

}

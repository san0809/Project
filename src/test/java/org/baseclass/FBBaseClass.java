package org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBBaseClass {
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
}

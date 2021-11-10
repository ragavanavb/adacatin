package com.adacatin.Adacatin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class  Basscalss {
	
	public static WebDriver driver;
	public static WebDriver getbrowser(String type ) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\browser\\chromedriver.exe" );
			driver = new ChromeDriver();
			
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
		
			driver = new FirefoxDriver();
		}
		
  return driver;
	}
	//geturl
	public static void geturl(String url) {
		driver.get(url);

	}
	//maximum
	public static void maximum() {
		driver.manage().window().maximize();

	}
	//click
	public static void click(WebElement element) {
		element.click();
}
	//sendkeys
	public static void sendkeys(WebElement element,String input ) {
		element.sendKeys(input);

	}
	//selectbytext
	public static void Select(WebElement select,String optionselect ) {
		Select sel = new Select(select);
		sel.selectByVisibleText(optionselect);

	}
	//selectbyindex
	public static void selectindex(WebElement select,int optionselect ) {
    Select sel = new Select(select);
    sel.selectByIndex(optionselect);
	}
	//clear
	public static void clear(WebElement clr) {
    clr.clear();
	}
	
	//wait
	public static void wait(int time) {
    driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	//dropdown
	public static void dropdown(WebElement element,int index) {
		Select sel = new Select(element);
				try {
					if (index<0  ) {
						
					}
					
				} catch (Exception e) {
				}

	}
	
	//screenshot
	public  static void screenshot() throws IOException {
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//File des = new File("C:\Users\elcot\eclipse-workspace\Mavenp\screenshot\one.png");
		//FileUtils.copyFile(source, des);

}
}

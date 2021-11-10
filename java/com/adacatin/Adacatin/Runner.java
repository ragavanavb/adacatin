package com.adacatin.Adacatin;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Runner extends Basscalss {
	
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		driver = getbrowser("chrome");
		geturl("https://adactinhotelapp.com/");
		maximum();
		WebElement user = driver.findElement(By.id("username"));
		sendkeys(user, "ragavanavb");
		WebElement passd = driver.findElement(By.id("password"));
		sendkeys(passd, "76DY1M");
		WebElement log = driver.findElement(By.id("login"));
		click(log);
		WebElement loc = driver.findElement(By.id("location"));
		Select(loc, "Melbourne");
		WebElement ho = driver.findElement(By.id("hotels"));
		Select(ho, "Hotel Sunshine");
		WebElement room = driver.findElement(By.id("room_type"));
		Select(room, "Double");
		WebElement no = driver.findElement(By.id("room_nos"));
		selectindex(no, 3);
		WebElement dat = driver.findElement(By.id("datepick_in"));
		clear(dat);
		sendkeys(dat, "04/11/2021");
		WebElement da = driver.findElement(By.id("datepick_out"));
		clear(da);
		sendkeys(da, "05/11/2021");
		WebElement adu = driver.findElement(By.id("adult_room"));
		selectindex(adu, 1);
		WebElement chi = driver.findElement(By.id("child_room"));
		selectindex(chi, 1);
		WebElement ser = driver.findElement(By.id("Submit"));
		click(ser);
		wait(5);
		WebElement button = driver.findElement(By.id("radiobutton_0"));
		click(button);
		WebElement cont = driver.findElement(By.id("continue"));
		click(cont);
		WebElement name = driver.findElement(By.id("first_name"));
		sendkeys(name, "ragav");
		WebElement namel = driver.findElement(By.id("last_name"));
		sendkeys(namel, "veera");
		WebElement add = driver.findElement(By.id("address"));
		sendkeys(add, "annanagar chennai");
		WebElement card = driver.findElement(By.id("cc_num"));
		sendkeys(card, "98428798235767");
		WebElement cctype = driver.findElement(By.id("cc_type"));
		selectindex(cctype, 1);
		WebElement expmnt = driver.findElement(By.id("cc_exp_month"));
		selectindex(expmnt, 1);
		WebElement expyr = driver.findElement(By.id("cc_exp_year"));
		selectindex(expyr, 5);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		sendkeys(cvv, "928");
		wait(5);
		WebElement subit = driver.findElement(By.id("book_now"));
		click(subit);

		
	}

}

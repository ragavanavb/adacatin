package com.adacatin.Adacatin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	public WebDriver driver;

	public Select_hotel(WebDriver dri3) {
		this.driver = dri3;
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	@FindBy(id="continue")
	private WebElement cont;

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getCont() {
		return cont;
	}
	
	
	
	
	
	
	
	
}

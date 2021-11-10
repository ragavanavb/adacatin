package com.adacatin.Adacatin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
	public Search_hotel(WebDriver dri2) {
		this.driver = dri2;
		PageFactory.initElements(driver, this);
	}


	public WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoom_type() {
		return room_type;
	}


	public WebElement getRoomno() {
		return roomno;
	}


	public WebElement getDatein() {
		return datein;
	}


	public WebElement getDateout() {
		return dateout;
	}


	public WebElement getAdult() {
		return adult;
	}


	public WebElement getChild() {
		return child;
	}


	public WebElement getSearch() {
		return search;
	}


	@FindBy(id="location")
    private WebElement	location;
	
	@FindBy(id="hotels")
	private	WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement room_type;
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(id="datepick_in")
	private WebElement datein;
	   
	@FindBy(id="datepick_out")
	private WebElement dateout;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	
	@FindBy(id="Submit")
	private WebElement search;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

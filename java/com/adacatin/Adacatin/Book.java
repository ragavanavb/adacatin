package com.adacatin.Adacatin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book {
	public WebDriver driver;
  public Book(WebDriver dri4) {
     this.driver=dri4;
     PageFactory.initElements(driver, this);
  
  }

@FindBy(id="first_name")
  private WebElement fname;
  
  @FindBy(id="last_name")
  private WebElement lname;
  
  public WebDriver getDriver() {
	return driver;
}

public WebElement getFname() {
	return fname;
}

public WebElement getLname() {
	return lname;
}

public WebElement getAdderss() {
	return adderss;
}

public WebElement getCardnum() {
	return cardnum;
}

public WebElement getCctype() {
	return cctype;
}

public WebElement getCardmnth() {
	return cardmnth;
}

public WebElement getCardyr() {
	return cardyr;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getBook() {
	return book;
}

@FindBy(id="address")
  private WebElement adderss;
  
  @FindBy(id="cc_num")
  private WebElement cardnum;
  
  @FindBy(id="cc_type")
  private WebElement cctype;
  
  @FindBy(id="cc_exp_month")
  private WebElement cardmnth;
  
  @FindBy(id="cc_exp_year")
  private WebElement cardyr;
  
  @FindBy(id="cc_cvv")
  private WebElement cvv;
  
  @FindBy(id="book_now")
  private WebElement book;
  

}

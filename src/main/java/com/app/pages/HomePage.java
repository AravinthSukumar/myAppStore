package com.app.pages;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage {

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement Women;
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a ")
	private WebElement Dresses;
	@FindBy(xpath = " //*[@id='block_top_menu']/ul/li[3]/a ")
	private WebElement Shirts;
	@FindBy(xpath = "//*[@id='newsletter-input']")
	private WebElement Newsletter;
	@FindBy(xpath = "//*[@class='form-group']/button")
	private WebElement Button;
	@FindBy(xpath="//*[@class='layered_filter'][2]//li[1]/div[1]/span/input")
	private WebElement Checkbox_s;
	@FindBy(xpath="//*[@class='layered_filter'][2]//li[1]/label/a")
    private WebElement dresssize_s;
	@FindBy(xpath="//*[@class='layered_filter'][2]//li[2]/label/a")
    private WebElement dresssize_m;
	@FindBy(xpath="//*[@class='layered_filter'][2]//li[3]/label/a")
    private WebElement dresssize_l;
	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement headercount;
	@FindBys(@FindBy (xpath="//*[@class='product_list grid row']"))
    private List<WebElement> productlist;	
	@FindBy(xpath="//*[@id='social_block']/ul/li[2]/a")
	private WebElement Twitter;
	
	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {

		return Women;
	}

	public WebElement getDresses() {
		return Dresses;
	}

	public WebElement getShirts() {
		return Shirts;
	}


	public String WomenLink() {
		Women.click();
		return driver.getTitle();
	}

	public String Dresseslink() {
		Dresses.click();
		return driver.getTitle();
	}

	public String Shirtslink() {
		Shirts.click();
		return driver.getTitle();
	}
	public void verifynewsletter() {               
	int random=new Random().nextInt(8000000);
	String names="aravi"+random+"@gmail.com";
	Newsletter.sendKeys(names);
	Button.click();
	String namess=Newsletter.getAttribute("value");
	System.out.println(namess);
	}
	
	public WebElement SizeDisplay() {

        Dresses.click();
     return dresssize_s;
	}
	public WebElement SizeDisplay1() {        
		Dresses.click();
	     return dresssize_m; 
		
	}
	public WebElement SizeDisplay2() {        
		Dresses.click();
	     return dresssize_l;

	}
	public WebElement Social()	{
		Shirts.click();
		Twitter.click();
		return Twitter;
		
	}
	}


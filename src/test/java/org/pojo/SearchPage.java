package org.pojo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends LibGlobal{
	public SearchPage(){
		PageFactory.initElements(driver,this);
}
	@FindBy(id="twotabsearchtextbox")
	private WebElement text;
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement search;
	
	public WebElement getText() {
		return text;
	}
	
	public WebElement getSearch() {
		return search;
	}
}

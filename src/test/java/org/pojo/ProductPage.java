package org.pojo;

import java.util.List;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends LibGlobal {
	public ProductPage(){
		PageFactory.initElements(driver,this);
}
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	private List<WebElement> products;
	@FindBy(xpath="//span[@class='a-price-whole']")
	private List<WebElement> price;
	
	
	public List<WebElement> getPrice() {
		return price;
	}

	public List<WebElement> getProducts() {
		return products;
	}

}

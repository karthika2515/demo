package org.amazon;

import java.util.Set;
import java.util.TreeSet;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.pojo.ProductPage;
import org.pojo.SearchPage;
import org.testng.annotations.Test;

public class Amazon extends LibGlobal {
@Test
private void test1() {

		launchBrowser();
		launchUrl("https://www.amazon.in/");
		maxBrowser();
		SearchPage s = new SearchPage();
		WebElement text = s.getText();
		type(text, "HP Laptops");
		WebElement search = s.getSearch();
		btnclick(search);
		ProductPage p = new ProductPage();
		for (int i = 0; i < p.getProducts().size(); i++) {
			WebElement e = p.getProducts().get(i);
			String name = e.getText();
			System.out.println(name);
		}

		Set afterDuplicate = new TreeSet();
		String cost;
		for (int j = 0; j < p.getPrice().size(); j++) {
			WebElement e = p.getPrice().get(j);
			cost = e.getText();
			String replace = cost.replace(",", "");
			int parseInt = Integer.parseInt(replace);

			if (parseInt >= 35000) {
				afterDuplicate.add(parseInt);
				System.out.println("List of  price above $35000 :" + parseInt);
				System.out.println("demo for git ");
				
			}

		}

	}
}


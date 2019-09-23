package com.qa.amazon.steps;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.qa.amazon.pages.CategorySelectionPage;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by Pramila Fulari on 9/23/2019.
 */

public class CategorySelectionActions extends CategorySelectionPage {
	
	public CategorySelectionActions(AndroidDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public void clickElectronincs() {
		waitForElementPresent(getElectronics());
		doClick(getElectronics());
	}
	
	public void clickKindle() {
		waitForElementPresent(getKindle());
		doClick(getKindle());
	}
	
	public void verifyKindleElement() throws Exception {
		doClick(getElectronics());
		Assert.assertEquals(getElementText(getElectronics()), "TV, Appliances, Electronics");
		doClick(getKindle());
		Assert.assertEquals(getElementText(getKindle()), "Kindle E-Readers & eBooks");
		try {
			presenceOfElement(getKindleEreader());
		} catch (Exception e) {
			throw new Exception("Element Not found");
		}
	}
	

}

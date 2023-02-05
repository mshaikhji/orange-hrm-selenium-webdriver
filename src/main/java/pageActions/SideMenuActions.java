package pageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.SideMenuObjects;
import testCases.BaseTest;

public class SideMenuActions extends CommonActions {
	

	public void verifySideMenuIsVisible() {
		verifyElementIsVisible("CSS", SideMenuObjects.sideMenu);
	}

	public By getMenuElement(String menuName) {
	    return By.xpath(String.format(SideMenuObjects.menuByGivenName, menuName));
	}

	public void clickMenuByGivenName(String menuName) {
		WebElement menu = BaseTest.driver.findElement(this.getMenuElement(menuName));
		Assert.assertEquals(true, menu.isDisplayed());
		Assert.assertEquals(true, menu.isEnabled());
		menu.click();
		
	}
}

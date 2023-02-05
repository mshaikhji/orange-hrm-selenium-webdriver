package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.AdminPageObjects;
import testCases.BaseTest;

public class AdminPageActions extends CommonActions {
	
	public By getAdminSubMenuOptionByGivenName(String optionName) {
		return By.xpath(String.format(AdminPageObjects.adminSubMenuOptionBYGivenName, optionName));
	}
	
	public void clickGivenAdminSubMenu(String subMenuName) {
		WebElement subMenuButton = BaseTest.driver.findElement(this.getAdminSubMenuOptionByGivenName(subMenuName));
		Assert.assertEquals(true, subMenuButton.isDisplayed());
		Assert.assertEquals(true, subMenuButton.isEnabled());
		subMenuButton.click();
	}
	
	public By getGvenOptionForJobMenu(String optionName) {
		return By.xpath(String.format(AdminPageObjects.optionInJobMenuByOptionNameString, optionName));
	}
	
	public void clickGivenOptionInJobMenu(String optionName) {
		WebElement subMenuButton = BaseTest.driver.findElement(this.getGvenOptionForJobMenu(optionName));
		Assert.assertEquals(true, subMenuButton.isDisplayed());
		Assert.assertEquals(true, subMenuButton.isEnabled());
		subMenuButton.click();
	}
	
}

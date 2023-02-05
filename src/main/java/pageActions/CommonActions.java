package pageActions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utils.ElementFetch;

public class CommonActions {

	ElementFetch elementFetch = new ElementFetch();
	
	public WebElement getElement(String elementType, String locator) {
		WebElement element = elementFetch.getWebElement(elementType, locator);
		return element;
	}
	
	public List<WebElement> getElements(String elementType, String locator) {
		List<WebElement> element = elementFetch.getWebElements(elementType, locator);
		return element;
	}
	
	public void verifyElementIsVisible(String elementType, String locator) {
		WebElement element = this.getElement(elementType, locator);
		Assert.assertEquals(true, element.isDisplayed());
	}
	
	public void verifyElementIsEnabled(String elementType, String locator) {
		WebElement element = this.getElement(elementType, locator);
		Assert.assertEquals(true, element.isEnabled());
	}
	
	public void enterGivenTextInInputField(String elementType, String locator, String inputText) {
		WebElement element = this.getElement(elementType, locator);
		this.verifyElementIsVisible(elementType, locator);
		this.verifyElementIsEnabled(elementType, locator);
		element.clear();
		element.sendKeys(inputText);
		
	}
	
	public void clickElement(String elementType, String locator) {
		WebElement element = this.getElement(elementType, locator);
		this.verifyElementIsEnabled(elementType, locator);
		this.verifyElementIsEnabled(elementType, locator);
		element.click();
	}
}

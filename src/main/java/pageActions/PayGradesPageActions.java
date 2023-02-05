package pageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObjects.PayGradesPageObjects;
import testCases.BaseTest;

public class PayGradesPageActions extends CommonActions {

	public void clickAddButton() {
		clickElement("XPATH", PayGradesPageObjects.addButton);
	}

	public void enterTextInPayGradeNameField(String payGradeName) {
		verifyElementIsVisible("XPATH", PayGradesPageObjects.payGradeNameField);
		enterGivenTextInInputField("XPATH", PayGradesPageObjects.payGradeNameField, payGradeName);
	}

	public void clickSaveButtonForGivenChange(String changeName) {
		if (changeName == "Name") {
			clickElement("XPATH", PayGradesPageObjects.saveButton);
		}

		if (changeName == "Add Currency") {
			List<WebElement> saveButton = getElements("XPATH", PayGradesPageObjects.saveButton);
			for (WebElement webElement : saveButton) {
				Assert.assertEquals(true, webElement.isDisplayed());
				WebElement saveButtonToClick = new WebDriverWait(BaseTest.driver, 30)
						.until(ExpectedConditions.elementToBeClickable(saveButton.get(1)));
				Actions action =new Actions(BaseTest.driver);
				action.moveToElement(saveButtonToClick).click().build().perform();
				
			}
		}

	}

	public void clickAddButtonForCurrencies() {
		clickElement("XPATH", PayGradesPageObjects.addButtonForCurrencies);
	}

	public void openCurrencyList() {
		clickElement("XPATH", PayGradesPageObjects.currencySelectField);
	}

	public By getCurrencyByCurrencyName(String currencyName) {
		return By.xpath(String.format(PayGradesPageObjects.currencyByName, currencyName));
	}

	public void selectGivenCurrency(String currencyName) {
		WebElement currency = BaseTest.driver.findElement(this.getCurrencyByCurrencyName(currencyName));
		Assert.assertEquals(true, currency.isDisplayed());
		((JavascriptExecutor) BaseTest.driver).executeScript("arguments[0].scrollIntoView(true);", currency);
		currency.click();
	}

	public By getCurrencyValueFieldByName(String fieldName) {
		return By.xpath(String.format(PayGradesPageObjects.currencyValueFieldByNameString, fieldName));
	}

	public void enterCurrencyValueInGivenField(String fieldName, String currencyValue) {
		WebElement currency = BaseTest.driver.findElement(this.getCurrencyValueFieldByName(fieldName));
		Assert.assertEquals(true, currency.isDisplayed());
		currency.clear();
		currency.sendKeys(currencyValue);
	}

	public void verifyCurrencyInformationForGivenCurrencyField(String currencyFieldName, String currencyFieldValue) {
		List<WebElement> currencyColumn = getElements("XPATH", PayGradesPageObjects.currencyRecordColumnByIndex);
		for (WebElement webElement : currencyColumn) {
			Assert.assertEquals(true, webElement.isDisplayed());
			if (currencyFieldName == "Currency") {
				WebElement currencyName = currencyColumn.get(1);
				String currencyNameText = currencyName.getText();
				Assert.assertEquals(currencyNameText, currencyFieldValue);
			}

			if (currencyFieldName == "Minimum Salary") {
				WebElement minimumSalary = currencyColumn.get(2);
				String minimumSalaryText = minimumSalary.getText();
				Assert.assertEquals(minimumSalaryText, currencyFieldValue);
			}

			if (currencyFieldName == "Maximum Salary") {
				WebElement maxSalary = currencyColumn.get(3);
				String mmaxSalaryText = maxSalary.getText();
				Assert.assertEquals(mmaxSalaryText, currencyFieldValue);
			}

		}

	}

}

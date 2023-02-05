package pageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.PIMPageObjects;
import testCases.BaseTest;

public class PIMPageActions extends CommonActions {

	public By getSearchFieldBySearchParameter(String searchFieldName) {
		return By.xpath(String.format(PIMPageObjects.searchFieldBySearchParameter, searchFieldName));
	}

	public void enterTextInSearchField(String searchFieldName, String searchKeyword) {
		WebElement searchField = BaseTest.driver.findElement(this.getSearchFieldBySearchParameter(searchFieldName));
		Assert.assertEquals(true, searchField.isDisplayed());
		Assert.assertEquals(true, searchField.isEnabled());
		searchField.clear();
		searchField.sendKeys(searchKeyword);
	}

	public void verifySearchResultsAreVisible() {
		List<WebElement> searchResults = getElements("XPATH", PIMPageObjects.searchResults);
		for (WebElement webElement : searchResults) {
			Assert.assertEquals(true, webElement.isDisplayed());
		}
		int count = searchResults.size();
		Assert.assertTrue(count > 1);

	}

	public void verifySearchResultsMatchByGivenSearchKeywords(String searchKeywords) {
		List<WebElement> searchResults = getElements("XPATH", PIMPageObjects.searchResults);
		for (WebElement webElement : searchResults) {
			Assert.assertEquals(true, webElement.isDisplayed());
			String searchresult = webElement.getText();
			Assert.assertTrue(searchresult.contains(searchKeywords));

		}
	}

	public void clickSearchButton() {
		clickElement("XPATH", PIMPageObjects.searchButton);
	}

	public void verifyResultsInRecordsTableContainGivenSearchKeyword(String searchKeywords) {
		List<WebElement> resultInFirstNameColumn = getElements("XPATH", PIMPageObjects.firstNameColumnInRecordsTable);
		for (WebElement webElement : resultInFirstNameColumn) {
			if (webElement.isDisplayed()) {
				String firstNametextString = webElement.getText();
				if (firstNametextString.contains(searchKeywords)) {
					Assert.assertTrue(true);
				}
			}

		}

		List<WebElement> resultInLastNameColumn = getElements("XPATH", PIMPageObjects.lastNameColumnInRecordsTable);
		for (WebElement webElement : resultInLastNameColumn) {
			if (webElement.isDisplayed()) {
				String lastNametextString = webElement.getText();
				if (lastNametextString.contains(searchKeywords)) {
					Assert.assertTrue(true);
				}
			}
		}

	}
}

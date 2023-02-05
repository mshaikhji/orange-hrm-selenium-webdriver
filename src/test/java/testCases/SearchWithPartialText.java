package testCases;

import org.testng.annotations.Test;

import pageActions.LoginPageActions;
import pageActions.PIMPageActions;
import pageActions.SideMenuActions;

public class SearchWithPartialText extends BaseTest {
	
	@Test
	public void searchFlow() {
		LoginPageActions loginPageActions = new LoginPageActions();
		SideMenuActions sideMenuActions = new SideMenuActions();
		PIMPageActions pimPageActions = new PIMPageActions();
		
		loginPageActions.verifyLoginPageContentIsLoaded();
		loginPageActions.enterUsername("Admin");
		loginPageActions.enterPassword("admin123");
		loginPageActions.clickLoginButton();
		sideMenuActions.verifySideMenuIsVisible();
		sideMenuActions.clickMenuByGivenName("PIM");
		pimPageActions.enterTextInSearchField("Employee Name", "ch");
		pimPageActions.verifySearchResultsAreVisible();
		pimPageActions.verifySearchResultsMatchByGivenSearchKeywords("Ch");
		pimPageActions.clickSearchButton();
		pimPageActions.verifyResultsInRecordsTableContainGivenSearchKeyword("Ch");
		
		
	}

}

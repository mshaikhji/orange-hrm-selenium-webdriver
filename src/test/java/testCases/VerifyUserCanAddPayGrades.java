package testCases;
import org.testng.annotations.Test;

import pageActions.AdminPageActions;
import pageActions.LoginPageActions;
import pageActions.PayGradesPageActions;
import pageActions.SideMenuActions;

public class VerifyUserCanAddPayGrades extends BaseTest{
	
	@Test
	public void addPayGradeFlow() {
		LoginPageActions loginPageActions = new LoginPageActions();
		SideMenuActions sideMenuActions = new SideMenuActions();
		AdminPageActions adminPageActions = new AdminPageActions();
		PayGradesPageActions payGradesPageActions = new PayGradesPageActions();
		
		loginPageActions.verifyLoginPageContentIsLoaded();
		loginPageActions.enterUsername("Admin");
		loginPageActions.enterPassword("admin123");
		loginPageActions.clickLoginButton();
		sideMenuActions.verifySideMenuIsVisible();
		sideMenuActions.clickMenuByGivenName("Admin");
		adminPageActions.clickGivenAdminSubMenu("Job ");
		adminPageActions.clickGivenOptionInJobMenu("Pay Grades");
		payGradesPageActions.clickAddButton();
		payGradesPageActions.enterTextInPayGradeNameField("Indian Rupee");
		payGradesPageActions.clickSaveButtonForGivenChange("Name");
		payGradesPageActions.clickAddButtonForCurrencies();
		payGradesPageActions.openCurrencyList();
		payGradesPageActions.selectGivenCurrency("INR - Indian Rupee");
		payGradesPageActions.enterCurrencyValueInGivenField("Minimum Salary", "30000");
		payGradesPageActions.enterCurrencyValueInGivenField("Maximum Salary", "100000");
		payGradesPageActions.clickSaveButtonForGivenChange("Add Currency");
		payGradesPageActions.verifyCurrencyInformationForGivenCurrencyField("Currency", "Indian Rupee");
		payGradesPageActions.verifyCurrencyInformationForGivenCurrencyField("Minimum Salary", "30000.00");
		payGradesPageActions.verifyCurrencyInformationForGivenCurrencyField("Maximum Salary", "100000.00");
		
	}
	

}

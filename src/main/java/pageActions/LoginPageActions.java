package pageActions;

import org.openqa.selenium.WebElement;

import pageObjects.LoginPageObjects;

public class LoginPageActions extends CommonActions {


	public void verifyLoginPageContentIsLoaded() {
		verifyElementIsVisible("CSS", LoginPageObjects.loginPageContent);
	}
	
	public void enterUsername(String userName) {
		enterGivenTextInInputField("CSS", LoginPageObjects.userNameInputField, userName);
	}
	
	public void enterPassword(String password) {
		enterGivenTextInInputField("CSS", LoginPageObjects.passwordInputField, password);
	}
	
	public void clickLoginButton() {
		WebElement loginButton = getElement("XPATH", LoginPageObjects.loginButton);
		verifyElementIsVisible("XPATH", LoginPageObjects.loginButton);
		verifyElementIsEnabled("XPATH", LoginPageObjects.loginButton);
		loginButton.click();
		
	}
	
	
}

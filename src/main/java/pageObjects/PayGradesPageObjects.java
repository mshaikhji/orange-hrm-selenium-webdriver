package pageObjects;

public interface PayGradesPageObjects {

	String addButton = "//button[text()=\" Add \"]"; 
	String payGradeNameField = "//*[@class=\"oxd-form-row\"]//input";
	String addButtonForCurrencies = "//*[text()=\"Currencies\"]/parent::div//button";
	String saveButton= "//*[text()=\" Save \"]";
	String currencySelectField = "//*[@class=\"oxd-select-text oxd-select-text--active\"]/div[text()=\"-- Select --\"]";
	String currencyByName = "//*[text()=\"%s\"]";
	String currencyValueFieldByNameString = "//*[text()=\"%s\"]/..//parent::div//input";	
	String currencyRecordColumnByIndex = "//*[@class=\"orangehrm-container\"]//*[@class=\"oxd-table-cell oxd-padding-cell\"]/div";
}

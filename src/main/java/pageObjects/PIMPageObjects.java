package pageObjects;

public interface PIMPageObjects {

	String searchFieldBySearchParameter = "//*[text()=\"%s\"]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//input";
	String searchResults = "//*[@role=\"option\"]/span";
	String searchButton = "//button[text()=\" Search \"]";
	String firstNameColumnInRecordsTable = "//*[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"]//div[3]/div";
	String lastNameColumnInRecordsTable = "//*[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"]//div[4]/div";
}

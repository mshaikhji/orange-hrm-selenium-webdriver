package pageObjects;

public interface AdminPageObjects {
	String adminSubMenuOptionBYGivenName = "//*[@class=\"oxd-topbar-body-nav\"]//*[text()=\"%s\"]";
	String payGradesOptionString = "//a[text()=\"Pay Grades\"]";
	String optionInJobMenuByOptionNameString = "//*[text()=\"Job \"]/ancestor::ul//a[text()=\"%s\"]";
}

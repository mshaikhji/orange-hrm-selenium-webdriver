# Orange HRM selenium webdriver
A demo project using the automation tool, Selenium Webdriver. These tests are intended to provide examples of my understanding of Selenium Webdriver and to display my coding skill.
I've included:

## Page objects
- Page Actions in src/main/java/pageActions : Contains all logic for actions to be performed on each page.
-  Page Objects in src/main/java/pageObjects : Contains all locators for pages.
- Utility methods in src/main/java/utils: Common method to fetch elements based on type, Retry logic and Screenshot set up.

### Scenarios:
- `SearchWithPartialText.java`: Verify User Can Search with Partial Text and check the results in the table.
- `VerifyUserCanAddPayGrades.java`: Verify User Can Add Pay Grades and check results in the result table.

## Requirements

- [TestNG Plugin For Eclipse](https://github.com/cbeust/testng-eclipse)


## Setup
![image](https://drive.google.com/uc?export=view&id=1v9WOO24mfMhKkt-8mQZD45KfrI7Ae8-1) 
- You might need to add `screenshot` and `reports` folder in the main project directory as shown in the image above.
- clone this repo to a local directory
git clone https://github.com/mshaikhji/orange-hrm-selenium-webdriver.git
- Open Eclipse and select File from top menu bar.
- Select `Open Projects From File System`.
- Once dependencies are installed, click on `Help` in top menu bar.
- Select `Install new Software` and click Add button.
- Enter any name (example: TestNG).
- Enter url from https://github.com/cbeust/testng-eclipse > LATEST RELEASE > https://testng.org/testng-eclipse-update-site/6.9.11 (Or any other version if this is not available).
- Click Finish.

## Run Tests
- Open testng.xml
- Right click > Run As > Configuration.
- Select TestNG > Select Project as `yourProjectName` (If not already selected).
- Select `Suite` and give the correct path.
- Click Run

## TroubleShooting
- If reports are not displayed, please refresh the project.
- If use see `An internal error occurred during: "Launching...` when you run the test:
 > Go to 
- Help
- Install new software...
- What is already installed?
- Select the TestNG M2E software and click uninstall


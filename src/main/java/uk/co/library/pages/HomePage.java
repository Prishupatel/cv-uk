package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "keywords")
    WebElement jobTitleField;


    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;


    @FindBy(id = "distance")
    WebElement distanceDropDown;


    @FindBy(xpath = "//div[@class='hp-search-more']")
    WebElement moreSearchLink;


    @FindBy(id = "salarymin")
    WebElement minSalaryField;


    @FindBy(id = "salarymax")
    WebElement maxSalaryField;


    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;


    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;


    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsButton;

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleField, jobTitle);
        log.info("sending text to job title field: " +  jobTitleField.toString());

    }


    public void enterLocation(String location) {
        sendTextToElement(locationField, location);
        log.info("sending text to  : " +  location.toString());

    }

    public void selectDistance(String distance) {
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
        log.info("selecting distance  : " +  distanceDropDown.toString());

    }

    public void clickOnMoreSearchOptionsLink() {
        clickOnElement(moreSearchLink);
        log.info("clicking on  : " +  moreSearchLink.toString());

    }

    public void enterSalaryMin(String min) {
        sendTextToElement(minSalaryField, min);
        log.info("sending text to  : " +  minSalaryField.toString());

    }

    public void enterSalaryMax(String max) {
        sendTextToElement(maxSalaryField, max);
        log.info("sending text to  : " +  maxSalaryField.toString());

    }

    public void selectSalaryType(String salaryType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown, salaryType);
        log.info("selecting salary type  : " + salaryTypeDropDown.toString());

    }

    public void selectJobType(String jobType) {
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        log.info("selecting job types  : " + jobTypeDropDown.toString());

    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsButton);
        log.info("clicking on  : " +  findJobsButton.toString());

    }


}

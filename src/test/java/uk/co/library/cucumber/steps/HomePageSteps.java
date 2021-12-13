package uk.co.library.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import uk.co.library.pages.HomePage;

public class HomePageSteps {

    @When("^I enter my job in \"([^\"]*)\"$")
    public void iEnterMyJobIn(String arg0) {
        new HomePage().enterJobTitle(arg0);
    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String arg0) {
        new  HomePage().enterLocation(arg0);

    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String arg0) {
        new HomePage().selectDistance(arg0);

    }

    @And("^I click on more search options$")
    public void iClickOnMoreSearchOptions() {
        new HomePage().clickOnMoreSearchOptionsLink();
    }

    @And("^I enter minimum salary \"([^\"]*)\"$")
    public void iEnterMinimumSalary(String arg0) {
   new HomePage().enterSalaryMin(arg0);
    }

    @And("^I enter maximum salary \"([^\"]*)\"$")
    public void iEnterMaximumSalary(String arg0) {
        new HomePage().enterSalaryMax(arg0);

    }

    @And("^I select job type \"([^\"]*)\"$")
    public void iSelectJobType(String arg0) {
        new HomePage().selectJobType(arg0);

    }

    @And("^I click on find job button$")
    public void iClickOnFindJobButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @And("^I enter salary type \"([^\"]*)\"$")
    public void iEnterSalaryType(String arg0)  {
        new HomePage().selectSalaryType(arg0);

    }
}

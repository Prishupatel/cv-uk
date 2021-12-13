package uk.co.library.cucumber.steps;

import cucumber.api.java.en.Then;
import uk.co.library.pages.ResultPage;

public class ResultPageSteps {
    @Then("^I can see the result \"([^\"]*)\"$")
    public void iCanSeeTheResult(String arg0) {
        new ResultPage().verifyTheResults(arg0);

    }
}

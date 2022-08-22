package com.utest.reto.stepdefinitions;
import com.utest.reto.tasks.Login;
import com.utest.reto.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegisterUserStepDefinitions {

    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Michel in the home page$")
    public void thanMichelInTheHomePage() {
        OnStage.theActorCalled("Michel").wasAbleTo( OpenUp.thePage(),(Login.onthePage()));

    }


    @When("^he create an account$")
    public void heCreateAnAccount() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.makeInformation());

    }

    @Then("^he sees it is username$")
    public void heSeesItIsUsername() {

    }

}

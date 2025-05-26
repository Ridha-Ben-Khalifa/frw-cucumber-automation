package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthentificationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class AuthentificationStepDefinition {
	private AuthentificationPage authentificationPage;

	public AuthentificationStepDefinition() {
		this.authentificationPage = new AuthentificationPage();
	}

	@Given("je me connecte sur lapplication Mercury")
	public void jeMeConnecteSurLapplicationMercury() {
		authentificationPage.goToUrl();

	}

	@When("je saisi le username {string}")
	public void jeSaisiLeUsername(String name) {
		authentificationPage.fillUserName(name);

	}

	@When("je saisi le password {string}")
	public void jeSaisiLePassword(String password) {
		authentificationPage.fillpassword(password);
	}

	@When("je clique sur le bouton submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authentificationPage.clickOnbtnSubmit();
	}

	@Then("je me redirige vers la page dacceuil {string}")
	public void jeMeRedirigeVersLaPageDacceuil(String text) {
		String msg = authentificationPage.welcomeMsg.getText();
		Assert.assertEquals(text, msg);
	}

}

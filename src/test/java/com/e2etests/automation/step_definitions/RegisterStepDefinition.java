package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {

    public RegisterPage registerPage;

    public RegisterStepDefinition() {
        this.registerPage = new RegisterPage();
    }

//    @Given("je me connecte sur lapplication Mercury")
//    public void jeMeConnecteSurLapplicationMercury() {
//        registerPage.goToUrl();
//    }

    @When("je clique sur le lien register")
    public void jeCliqueSurLeLienRegister() {
        RegisterPage.RegisterLink.click();
    }

    @When("je saisi le first name {string}")
    public void jeSaisiLeFirstName(String firstName) {
    	System.out.println("First name: " + firstName);
    }


    @And("je saisi le last name {string}")
    public void jeSaisiLeLastName(String lastName) {
        registerPage.saisirLastName(lastName);
    }

    @And("je saisi le phone number {string}")
    public void jeSaisiLePhoneNumber(String phone) {
        registerPage.saisirPhone(phone);
    }

    @And("je saisi le email {string}")
    public void jeSaisiLeEmail(String email) {
        registerPage.saisirEmail(email);
    }

    @And("je saisi l adress {string}")
    public void jeSaisiLAdress(String adress) {
        registerPage.saisirAdress(adress);
    }

    @And("je saisi city {string}")
    public void jeSaisiCity(String city) {
        registerPage.saisirCity(city);
    }

    @And("je saisi le state {string}")
    public void jeSaisiLeState(String state) {
        registerPage.saisirState(state);
    }

    @And("je saisi le code postal {string}")
    public void jeSaisiLeCodePostal(String postalCode) {
        registerPage.saisirPostalCode(postalCode);
    }

    @And("je saisi le pays {string}")
    public void jeSaisiLePays(String country) {
        registerPage.saisirCountry(country);
    }

    @And("je saisi le user name {string}")
    public void jeSaisiLeUserName(String userName) {
        registerPage.saisirUserName(userName);
    }

    @And("je saisi le mot de passe {string}")
    public void jeSaisiLeMotDePasse(String password) {
        registerPage.saisirPassword(password);
    }

    @And("je resaisi le mot de passe {string}")
    public void jeResaisiLeMotDePasse(String confirmPassword) {
        registerPage.saisirConfirmPassword(confirmPassword);
    }

    @And("je clique sur le bouton envoyer")
    public void jeCliqueSurLeBoutonEnvoyer() {
        registerPage.cliquerSubmit();
    }

    @Then("je me redirige vers la page dacceuille {string}")
    public void jeMeRedirigeVersLaPageDacceuille(String message) {
    	String msg = registerPage.DearMsg.getText();
		Assert.assertEquals(message, msg);
    }
} 

package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterPage {

	private ConfigFileReader configFileReader;

	/** @FindBy **/
	@FindBy(how = How.TAG_NAME, using = "a")
	public static WebElement RegisterLink;
		
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement FirstName;

	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement LastName;

	@FindBy(how = How.NAME, using = "phone")
	public static WebElement Phone;

	@FindBy(how = How.ID, using = "userName")
	public static WebElement Email;

	@FindBy(how = How.NAME, using = "address1")
	public static WebElement Adress;

	@FindBy(how = How.NAME, using = "city")
	public static WebElement City;

	@FindBy(how = How.NAME, using = "state")
	public static WebElement State;

	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement PostalCode;

	@FindBy(how = How.NAME, using = "country")
	public static WebElement Country;

	@FindBy(how = How.ID, using = "email")
	public static WebElement UserName;

	@FindBy(how = How.NAME, using = "password")
	public static WebElement Password;

	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement ConfirmPassword;

	@FindBy(how = How.NAME, using = "submit")
	public static WebElement BtnSubmit;
	
	@FindBy(how = How.TAG_NAME, using = "b")
	public static WebElement DearMsg;

	public RegisterPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	/** Create Methods **/

	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}
	public void cliquerRegister() {
		BtnSubmit.click();
	}

	public void saisirFirstName(String firstName) {
		FirstName.sendKeys(firstName);
	}

	public void saisirLastName(String lastName) {
		LastName.sendKeys(lastName);
	}

	public void saisirPhone(String phone) {
		Phone.sendKeys(phone);
	}

	public void saisirEmail(String email) {
		Email.sendKeys(email);
	}

	public void saisirAdress(String adress) {
		Adress.sendKeys(adress);
	}

	public void saisirCity(String city) {
		City.sendKeys(city);
	}

	public void saisirState(String state) {
		State.sendKeys(state);
	}

	public void saisirPostalCode(String postalCode) {
		PostalCode.sendKeys(postalCode);
	}

	public void saisirCountry(String country) {
		Country.sendKeys(country);
	}

	public void saisirUserName(String userName) {
		UserName.sendKeys(userName);
	}

	public void saisirPassword(String password) {
		Password.sendKeys(password);
	}

	public void saisirConfirmPassword(String confirmPassword) {
		ConfirmPassword.sendKeys(confirmPassword);
	}

	public void cliquerSubmit() {
		BtnSubmit.click();
	}

}

package com.hf_project.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends BasePage {



    @FindBy(xpath = "//button[@type='submit']")
    private WebElement createAccountButton;

    @FindBy(id = "register-firstname")
    private WebElement firstName;

    @FindBy(id = "register-lastname")
    private WebElement lastName;

    @FindBy(id = "register-email")
    private WebElement email;

    @FindBy(id = "register-password")
    private WebElement password;

    @FindBy(id = "register-confirmation")
    private WebElement passwordConfirmation;

    @FindBy(id = "register-telephone")
    private WebElement phoneNumber;

    @FindBy(xpath = "//p[@class='errorMsg']")
    private WebElement errorMessage;




    public String actualErrorMessage(){

        return errorMessage.getText();
    }



    public void fillRegistration(String firstName,String lastName, String email,String password,String passwordConf,String phoneNumber){

        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.passwordConfirmation.sendKeys(passwordConf);
        this.phoneNumber.click();
        this.phoneNumber.sendKeys(phoneNumber);

    }

    public void clickCreateAccountButton(){

        createAccountButton.click();
    }




}

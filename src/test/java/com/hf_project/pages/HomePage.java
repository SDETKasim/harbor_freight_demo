package com.hf_project.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{



    @FindBy(xpath = "//a[.='Create Account']")
    private WebElement createAccountLink;

    @FindBy(xpath = "//span[@class='my-account__text--yfDSxn']")
    private WebElement myAccountTab;

    @FindBy(xpath = "//a[.='Sign In']")
    private WebElement signInButton;

    public void clickCreateAccount(){

        myAccountTab.click();
        createAccountLink.click();

    }

    public void clickSignIn(){

        myAccountTab.click();
        signInButton.click();
    }

}

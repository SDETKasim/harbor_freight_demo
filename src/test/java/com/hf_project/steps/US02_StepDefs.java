package com.hf_project.steps;

import com.hf_project.pages.HomePage;
import com.hf_project.pages.LoginPage;
import com.hf_project.pages.OrdersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US02_StepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    OrdersPage ordersPage = new OrdersPage();

    @Given("user is on the login page {string}")
    public void theUserIsOnTheLoginPage(String expectedUrl) {

        homePage.clickSignIn();

        Assert.assertEquals(expectedUrl, loginPage.actualUrl());

    }
    @When("user enters their credentials from {string} {int}")
    public void userEntersTheirCredentialsFromAnd(String sheetName, int rowNumber) {

        loginPage.fillLoginFromExcel(sheetName,rowNumber);
    }
    @When("clicks the login button")
    public void clicks_the_login_button() {

        loginPage.clickLogin();
    }
    @Then("user should be redirected to the orders page {string}")
    public void user_should_be_redirected_to_the_orders_page(String expectedUrl) {

        Assert.assertEquals(expectedUrl,ordersPage.actualUrl());
    }
    @And("user should see header greeting text is {string} first name from {string} {int}")
    public void userShouldSeeHeaderGreetingTextIsFrom(String hiGreeting, String sheetName, int rowNumber) {

        String firstName = ordersPage.getFirstNameFromExcel(sheetName,rowNumber);
        String expectedAccountGreetingText = hiGreeting+firstName;

        Assert.assertEquals(expectedAccountGreetingText,ordersPage.actualAccountGreetingText());


    }
    @Then("user should remain on the login page {string}")
    public void userShouldRemainOnTheLoginPage(String expectedUrl) {

        Assert.assertEquals(expectedUrl,loginPage.actualUrl());
    }



}

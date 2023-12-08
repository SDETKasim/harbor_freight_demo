package com.hf_project.steps;

import com.hf_project.pages.HomePage;
import com.hf_project.pages.OrdersPage;
import com.hf_project.pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US01_StepDefs {

    HomePage homePage = new HomePage();
    OrdersPage ordersPage = new OrdersPage();
    RegistrationPage registrationPage =new RegistrationPage();



    @Given("user is on registration page {string}")
    public void user_is_on_registration_page_with_url(String expectedUrl) {

        homePage.clickCreateAccount();

        Assert.assertEquals(expectedUrl,registrationPage.actualUrl());

    }
    @When("the user enters valid {string}, {string}, {string}, {string}, {string}")
    public void the_user_enters_valid(String firstName, String lastName, String email, String password, String phoneNumber) {

        registrationPage.fillRegistration(firstName,lastName,email,password,password,phoneNumber);

    }
    @When("clicks on the Create Account button")
    public void clicks_on_the_button(String string) {

        registrationPage.clickCreateAccountButton();

    }

    @Then("user should be redirected to the customer orders page {string}")
    public void should_be_redirected_to_the_customer_orders_page(String expectedUrl) {

        Assert.assertEquals(expectedUrl,ordersPage.actualUrl());

    }

    @Then("user should see that header account greeting text is {string}")
    public void user_should_see_that_header_account_text_is(String expectedGreetingAccountText) {

        Assert.assertTrue(ordersPage.actualAccountGreetingText().equals(expectedGreetingAccountText));

    }

    @When("the user enters {string}, {string}, {string}, {string}, {string}")
    public void theUserEntersInvalid(String firstName, String lastName, String email, String password, String phoneNumber) {

        registrationPage.fillRegistration(firstName,lastName,email,password,password,phoneNumber);
    }

    @Then("the user should see an error message {string}")
    public void theUserShouldSeeAnErrorMessage(String expectedMessage) {

        Assert.assertEquals(expectedMessage,registrationPage.actualErrorMessage());
    }

    @When("the user enters {string}, {string}, {string}, {string}, {string}, {string}")
    public void theUserEntersInvalid(String firstName, String lastName, String email, String password, String passwordConf, String phoneNumber) {

        registrationPage.fillRegistration(firstName,lastName,email,password,passwordConf,phoneNumber);
    }



}

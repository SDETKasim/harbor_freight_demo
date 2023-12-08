package com.hf_project.pages;


import com.hf_project.utilities.ExcelUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "login-email")
    private WebElement emailField;

    @FindBy(id = "login-password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;

    public void fillLoginFromExcel(String sheetName, int rowNum){

        ExcelUtil excelUtil = new ExcelUtil(getExcelPath(),sheetName);

        String email = excelUtil.getCellData(rowNum,2);
        String password = excelUtil.getCellData(rowNum,3);

        emailField.sendKeys(email);
        passwordField.sendKeys(password);



    }

    public void clickLogin(){

        signInButton.click();
    }

}

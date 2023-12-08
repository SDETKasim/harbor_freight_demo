package com.hf_project.pages;


import com.hf_project.utilities.ExcelUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OrdersPage extends BasePage {



    @FindBy(xpath = "//a[.='Shop Now']")
    private WebElement shopNowTab;

    @FindBy(xpath ="//span[@class='my-account__text--yfDSxn']")
    private WebElement myAccountText;



    public String actualAccountGreetingText(){

        return myAccountText.getText();

    }

    public String getFirstNameFromExcel(String sheetName,int rowNum){

        ExcelUtil excelUtil = new ExcelUtil(getExcelPath(),sheetName);

        String firstName = excelUtil.getCellData(rowNum,0);

        return firstName;
    }
}

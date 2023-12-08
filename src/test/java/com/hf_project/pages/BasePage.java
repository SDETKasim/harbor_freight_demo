package com.hf_project.pages;

import com.hf_project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.domsnapshot.model.StringIndex;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    private String excelPath = "src/test/resources/testData/CustomerTestData.xlsx";

    @FindBy(xpath = "(//div/span[.='Shop'])[2]")
    private WebElement shopDropDownTab;

    @FindBy(id = "search-input")
    private WebElement searchBar;



    public WebElement presentationTabs(String headerName) {

        return Driver.getDriver().findElement(By.xpath("(//a[normalize-space(text())='" + headerName + "'])[2]"));

    }

    public String actualUrl(){

       return Driver.getDriver().getCurrentUrl();

    }

    public String getExcelPath(){

        return excelPath;
    }


}

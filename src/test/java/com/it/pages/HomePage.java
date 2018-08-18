package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public class HomePage extends BasePage {

	@FindBy(xpath="//ul[@class='sn_menu']/li[1]")
	private WebElement labelUserEmail;



    public String getLabelUserEmail() {
        /*WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait
                .until(ExpectedConditions.visibilityOf(labelUserEmail));*/
        driver.scrollDown();
        driver.scrollUp();
        return labelUserEmail.getText();
    }
}

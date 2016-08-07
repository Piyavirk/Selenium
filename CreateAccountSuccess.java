
package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountSuccess {
    private WebDriver driver;
    private String abc;

    public CreateAccountSuccess(WebDriver driver) {
        this.driver = driver;
    }

    public String findRegistrationconfirmMessage() {
        return driver.findElement(By.xpath("//*[contains(text(),'Thank you')]")).getText();
    }

}

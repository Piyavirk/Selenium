
package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Home {
    private WebDriver driver;

    public Home(WebDriver driver) {
        this.driver = driver;
    }

    public Register clickRegisterLink() {
        driver.findElement(By.linkText("REGISTER")).click();
        return PageFactory.initElements(driver, Register.class);
    }
}


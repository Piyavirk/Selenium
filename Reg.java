package com.seleniumTest;

import com.pageobjects.CreateAccountSuccess;
import com.pageobjects.Home;
import com.pageobjects.Register;
import com.setup.DriverSetup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by piya on 2016-08-07.
 */
public class Reg extends DriverSetup {
    @Test
    public void test() {
        Home homePage = PageFactory.initElements(driver, Home.class);
        Register register = homePage.clickRegisterLink();

        register.enterFirstname("Tiya");
        register.enterlastname("Tirk");
        CreateAccountSuccess successpage = register.clickSubmit();
        String message = successpage.findRegistrationconfirmMessage();
        Assert.assertTrue(message.contains("Thank you for registering"));


    }
}

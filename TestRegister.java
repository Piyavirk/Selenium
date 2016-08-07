package com.seleniumTest;

import com.pageobjects.CreateAccountSuccess;
import com.pageobjects.Home;
import com.pageobjects.Register;
import com.setup.DriverSetup;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class TestRegister extends DriverSetup{

    @Test
    public void registration(){
        Home homePage = PageFactory.initElements(driver,Home.class);
        Register register = homePage.clickRegisterLink();
        register.enterFirstname("Piya");
        register.enterlastname("Virk");
        register.enterPhone("123-456-7890");
        register.enterAddress("I live here");
        register.enterCity("Toronto");
        register.enterProvince("Ontario");
        register.selectCountry("CANADA");
        register.enterUserName("Piya Virk");
        register.enterPassword("abc");
        register.enterConfirmPassword("abc");
        CreateAccountSuccess createAccountSuccess = register.clickSubmit();
        String message = createAccountSuccess.findRegistrationconfirmMessage();
        assertTrue(message.contains("Thank you for registering"));
        assertFalse(message.contains("abcdegfh"));
        assertTrue(message.contains("abcdegfh"));
    }

}


    package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

    public class Register {
        private WebDriver driver;

        public Register(WebDriver driver) {
            this.driver = driver;
        }

        public void enterFirstname(String name){
            WebElement firstName = driver.findElement(By.name("firstName"));
            firstName.sendKeys(name);
        }

        public void enterlastname(String name){
            WebElement lastName = driver.findElement(By.name("lastName"));
            lastName.sendKeys(name);
        }

        public void enterPhone(String number){
            WebElement phone = driver.findElement(By.name("phone"));
            phone.sendKeys(number);
        }

        public void enterEmail(String emailAddress){
            WebElement email = driver.findElement(By.id("userName"));
            email.sendKeys(emailAddress);
        }

        public void enterAddress(String homeAddress){
            WebElement address = driver.findElement(By.name("address1"));
            address.sendKeys(homeAddress);
        }

        public void enterCity(String cityName){
            WebElement city = driver.findElement(By.name("city"));
            city.sendKeys(cityName);
        }

        public void enterProvince(String provinceName){
            WebElement province = driver.findElement(By.name("state"));
            province.sendKeys(provinceName);
        }

        public void selectCountry(String countryName){
            Select selectCountry = new Select(driver.findElement(By.name("country")));
            selectCountry.selectByVisibleText(countryName);
        }

        public void enterUserName(String name){
            WebElement userName = driver.findElement(By.id("email"));
            userName.sendKeys(name);
        }

        public void enterPassword(String password){
            WebElement passWord = driver.findElement(By.name("password"));
            passWord.sendKeys(password);
        }

        public void enterConfirmPassword(String password){
            WebElement confirmPassWord = driver.findElement(By.name("confirmPassword"));
            confirmPassWord.sendKeys(password);
        }

        public CreateAccountSuccess clickSubmit(){
            WebElement submitButton = driver.findElement(By.name("register"));
            submitButton.click();
            return PageFactory.initElements(driver,CreateAccountSuccess.class);
        }
    }

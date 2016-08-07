
package com.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverSetup {
    public WebDriver driver;

    public DriverSetup() {
    }

    @BeforeClass
    public void goToTestSite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piya\\IdeaProjects\\Selenium Tutorial\\lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
    }

    @AfterClass
    public void cleaup() {
        driver.close();
        driver.quit();
    }
}


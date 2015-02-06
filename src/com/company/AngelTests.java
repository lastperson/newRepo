package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

@RunWith(JUnit4.class)
public class AngelTests {
    WebDriver webDriver;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver",
                "C:/MyWork/AUT5/chromedriver.exe");
        webDriver = new ChromeDriver();
        //AngelPage.open(webDriver);
    }

    @Test
    public void emptyMaster_PasswordGenerates(){
        //AngelPage.setMaster(webDriver, "");
        //AngelPage.setSite(webDriver, "angel.net");
        //AngelPage.generate(webDriver);
        //Assert.assertNotEquals("", AngelPage.getPassword(webDriver));
    }

    @After
    public void cleanUp(){
        webDriver.quit();
    }
}

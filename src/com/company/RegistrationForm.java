package com.company;

import static helpers.TestHelper.*;

import helpers.TestHelper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class RegistrationForm {
    private static String firstNameXpath = "//input[contains(@name,'first_name')]";
    private static Map<String, String> companies = new HashMap<String, String>(){{
        put("sk.gif", "СКАЙД");
        put("ax.gif", "АХА");
        put("il.gif", "ІЛЛІЧІВСЬКЕ");
    }};

    public static String convertCompany(String img){
        if (img.equals("sk.gif"))
            return "СКАЙД";
        if (img.equals("ax.gif"))
            return "АХА";
        if (img.equals("il.gif"))
            return "ІЛЛІЧІВСЬКЕ";
        Assert.fail("Unknown company requested");
        return "UNKNOWN COMPANY!";
    }

    public static String convertCompany2(String img){
        return companies.get(img);
    }

    public static void open() {
        driver.get("http://demoqa.com/frames-and-windows/");
    }

    public static void setFirstName(String i){
        WebElement f = driver.findElement(By.xpath(firstNameXpath));
        f.sendKeys(i);
    }

    public static String getFirstName(){
        WebElement f = driver.findElement(By.xpath(firstNameXpath));
        return f.getText();
    }

    public static WebElement $(By by){
        return driver.findElement(by);
    }
}

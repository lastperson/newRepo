package com.company;

import helpers.TestHelper;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class FirstTests extends TestBase {
    @Test
    public void MyTest() {
        StrahovatorPage.clickMenu("ОСАГО");
        StrahovatorPage.setDropDown("я хочу застраховать", "прицеп");
        StrahovatorPage.setDropDown("детали", "для легкового автомобиля");
        StrahovatorPage.assertFirstCompany("СКАЙД");
    }

    @Test
    public void MyTest2() {
        TestHelper.driver.get("asdasd");
        testPassed = true;
    }

    @Test
    public void MyTest3() {
        testPassed = true;
    }
}

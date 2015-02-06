package com.company;

import helpers.TestHelper;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

@RunWith(JUnit4.class)
public class TestBase {
    public boolean testPassed;

    @Before
    public void dfgdfhdgkkjfsl() {
        TestHelper.init();
        RegistrationForm.open();
        TestHelper.driver.manage().window().maximize();
        testPassed = false;
    }

    @Rule
    public TestName name = new TestName();

    @After
    public void sdkgjlskdgjlkag() throws IOException {
        if (!testPassed) {
            File scrFile = ((TakesScreenshot) TestHelper.driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\tmp\\" + name.getMethodName() + ".png"));
        }
        TestHelper.fancyCleanUp();
    }
}

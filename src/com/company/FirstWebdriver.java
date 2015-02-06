package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;

public class FirstWebdriver {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver",
                "C:/MyWork/AUT5/chromedriver.exe");

        WebDriver a = new FirefoxDriver();

        a.get("http://www.toolsqa.com/automation-practice-form/");

        WebElement link1 = a.findElement(By.id("content")).findElements(By.tagName("a")).get(0);

        System.out.println(link1.getText());

        WebElement d = a.findElement(By.id("continents"));
        Select s = new Select(d);

        s.selectByVisibleText("Africa");

        int timeout = 10000;
        int timepassed = 0;
        WebElement h;
        while(timepassed < timeout){
            if (a.findElements(By.id("d")).size() > 0){
                h = a.findElements(By.id("d")).get(0);
                break;
            }
            Thread.sleep(100);
            timepassed += 100;
        }


        System.out.println(s.getFirstSelectedOption().getText());

        WebElement g = a.findElement(By.id("selenium_commands"));
        Select s2 = new Select(g);

        Actions f = new Actions(a).click(s2.getOptions().get(0)).keyDown(Keys.LEFT_SHIFT).click(s2.getOptions().get(4));
        f.perform();

        a.findElement(By.id("photo")).click();

        StringSelection ss = new StringSelection("C:\\MyWork\\AUT5\\newRepo\\.gitignore");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //imitate mouse events like ENTER, CTRL+C, CTRL+V
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        String j = "123456557878990qwewetytutudfbvcvckjsd::WR)EWT*%#&@#)!@<>?|+_!";



        WebElement i = a.findElement(By.xpath("//input[@name='first_name']/../label"));
        WebElement l = a.findElement(By.xpath("//div[input[@name='first_name']]/label"));
        System.out.println(i.getText());

        String forName = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM_";

        Random r = new Random();
        int o = 0;
        String userName = "";
        while(o < 10) {
            int n = r.nextInt(forName.length());
            userName = userName + forName.charAt(n);
            o++;
        }
        System.out.println(userName);


        //a.quit();
    }
}

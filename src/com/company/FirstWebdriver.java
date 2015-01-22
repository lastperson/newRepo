package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstWebdriver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:/MyWork/AUT5/chromedriver.exe");

        WebDriver a = new ChromeDriver();

        a.get("http://translate.google.com");

        String[] input = {"товарищ", "привет", "пока"};
        String[] expected = {"comrade", "hi", "as long as"};
        int j = 0;
        WebElement i = a.findElement(By.id("source"));
        while(j<input.length) {
            i.clear(); // Очистили поле
            i.sendKeys(input[j]); // Напечатали текст
            Thread.sleep(1000);
            String result = a.findElement(By.id("result_box")).getText();
            System.out.print(result);
            if (true) {
                System.out.println(" - passed");
            } else {
                System.out.println(" - failed");
            }
            j = j + 1;
        }

        a.quit();
    }
}

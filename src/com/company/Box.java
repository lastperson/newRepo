package com.company;

public class Box {
    public String boxName = "Box";

    public void name() {
        System.out.println(boxName);
    }

    public void rename(String newName) {
        boxName = newName;
    }

    public void fillFirstName(String firstName) {
        //a.findElement(By.id("firstNameNewCool")).sendKeys(firstName);
    }


}

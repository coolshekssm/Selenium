package org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

    @DataProvider(name = "LoginData")
    public Object[][] generateData(){
        return new Object[][] {
                {"akhiljda@gmail.com","Password"}
        };
    }


    @Test(dataProvider = "LoginData")
    public void succesfulLogin(String un, String pw) {
        ChromeDriver cd = new ChromeDriver();
        cd.get("https://demo.evershop.io/account/login");
        cd.findElement(By.xpath("//input[@name = 'email']")).sendKeys(un);
        cd.findElement(By.name("password")).sendKeys(pw);
        cd.findElement(By.xpath("//button[@type = 'submit']")).click();

    }
}
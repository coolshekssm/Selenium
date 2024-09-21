package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelctorpgTest {
    static WebDriver wd;
    //ChromeDriver wd = new ChromeDriver();

    public SelctorpgTest(WebDriver driver)
    {
        this.wd=driver;
    }

    public static void main(String[] args) {
        WebDriver cd=new ChromeDriver();
        SelctorpgTest test=new SelctorpgTest(cd);

        test.enterEmail();
        test.enterPassword();
        test.enterCompany();
        test.enterMobile();
        test.Submit();

    }
    public static void enterEmail()
    {
        //ChromeDriver wd = new ChromeDriver();
        wd.get("https://selectorshub.com/xpath-practice-page/");
        wd.findElement(By.xpath("//input[@title='Email']")).sendKeys("Abhishek");

    }
    public static void enterPassword()
    {

        wd.findElement(By.xpath("//input[@id='pass']")).sendKeys("Abhishek_01");

    }
    public static void enterCompany()
    {

        wd.findElement(By.xpath("//input[@name='company']")).sendKeys("Geeks");

    }
    public static void enterMobile()
    {

        wd.findElement(By.xpath("//input[@name='mobile number']")).sendKeys("5795435589");

    }
    public static void Submit()
    {

        wd.findElement(By.xpath("//button[@value='Submit']")).click();
        //wd.quit();
    }
}
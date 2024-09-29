package org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class DataProviderConcept {

    @DataProvider(name = "LoginData")
    public Object[][] generateData(){
        return new Object[][] {
                {"akhiljda@gmail.com","Password"}
        };
    }


    @Test(dataProvider = "LoginData")
    public void succesfulLogin(String un, String pw) throws MalformedURLException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "oauth-akash.abhi1992-38819");
        sauceOptions.put("accessKey", "915b47a8-5364-4567-97a3-b7b4d53c8f52");
        sauceOptions.put("build", "selenium-build-4JS70");
        sauceOptions.put("name", "SauceFirst");
        browserOptions.setCapability("sauce:options", sauceOptions);
        URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
        driver.get("https://demo.evershop.io/account/login");
        driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys(un);
        driver.findElement(By.name("password")).sendKeys(pw);
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

    }
}

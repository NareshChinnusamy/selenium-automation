package com.rpc.seleniumautomation.stagingtest;

import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GetVehicleListingTest {

    public WebDriver driver = null;

    @BeforeEach
    public void setUp() throws Exception {

        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(false);
        options.setAcceptInsecureCerts(true);
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.setCapability(CapabilityType.BROWSER_NAME, "firefox");

        try {
            driver = new RemoteWebDriver(new URL("http://192.168.29.25:4444"), options);

        } catch (Exception e) {
            System.out.println("Invalid grid URL");
        }

    }

    @Test
    public void firstTestCase() {
        try {
            System.out.println("Entering the selenium Test");
            driver.get("https://www.revolution.film/");
            System.out.println(driver.getTitle());
            driver.close();
            System.out.println("Leaving the selenium Test");
        } catch (Exception e) {

        }

    }

}

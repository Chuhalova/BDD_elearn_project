package com.cucumber.junit;

import com.cucumber.junit.manager.PageFactoryManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    protected WebDriver driver;
    PageFactoryManager pageFactoryManager;


    @Before
    public void testsSetup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

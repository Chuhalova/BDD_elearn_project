package com.cucumber.junit.manager;

import com.cucumber.junit.pages.DocsPage;
import com.cucumber.junit.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
    private static WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public static HomePage getHomePage() {
        return new HomePage(driver);
    }

    public static DocsPage getDocsPage() {
        return new DocsPage(driver);
    }
}

package com.cucumber.junit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.String.format;

public class HomePage extends BasePage {
    private static final String TEXT_PATTERN = "%s[contains(text(), '%s')]";
    private static final String MENU_SECTION = "//a[contains(@class, 'nav-link')]";
    private static final String CHILD_MENU_ITEM = "//div[contains(@class, 'dropdown-mega')]//a[contains(@class, 'item')]";

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void openCucumberWebsite(String url) {
        driver.get(url);
    }

    public WebElement menuSection(String linkText) {
        return findElement(By.xpath(format(TEXT_PATTERN, MENU_SECTION, linkText)));
    }

    public WebElement childMenuItem(String linkText) {
        return findElement(By.xpath(format(TEXT_PATTERN, CHILD_MENU_ITEM, linkText)));
    }

}

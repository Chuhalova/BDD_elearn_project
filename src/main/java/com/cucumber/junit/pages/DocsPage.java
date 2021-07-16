package com.cucumber.junit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocsPage extends BasePage{
    private static final String PAGE_NAME = "//*[@class='page-header']/*[contains(@class, 'title')]";

    public DocsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageWithTitleDisplayed(String title){
        return findElement(By.xpath(PAGE_NAME)).getText().equals(title);
    }
}

package com.cucumber.junit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArticlePage extends BasePage {
    private static final String PAGE_TITLE = "//div[@class='hero-header']";

    public ArticlePage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return findElement(By.xpath(PAGE_TITLE)).getText();
    }
}

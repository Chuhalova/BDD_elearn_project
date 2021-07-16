package com.cucumber.junit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DocsPage extends BasePage{
    private static final String PAGE_NAME = "//*[@class='page-header']/*[contains(@class, 'title')]";
    private static final String MENU_TITLES = "//a[contains(@class, 'panel-block  ')]";

    public DocsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageWithTitleDisplayed(String title){
        return findElement(By.xpath(PAGE_NAME)).getText().equals(title);
    }

    public List<WebElement> getMenuItemTitles(){
        return findElements(By.xpath(MENU_TITLES));
    }

    public List<WebElement> getMenuItem(){
        return findElements(By.xpath(MENU_TITLES));
    }

    public String getTextOfFirstMenuItem(){
        return driver.findElements(By.xpath(MENU_TITLES)).get(0).getText();
    }
}

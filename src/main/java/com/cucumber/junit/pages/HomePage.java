package com.cucumber.junit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.String.format;

public class HomePage extends BasePage {
    private static final String TEXT_PATTERN = "%s[contains(text(), '%s')]";
    private static final String MENU_SECTION = "//a[contains(@class, 'nav-link')]";
    private static final String CHILD_MENU_ITEM = "//div[contains(@class, 'dropdown-mega')]//a[contains(@class, 'item')]";
    private static final String SEARCH_LINK = "//a[contains(@class, 'search')]";
    private static final String SEARCH_POPUP = "//*[@class='app-input']";
    private static final String SEARCH_INPUT = "//input[contains(@class, 'query')]";
    private static final String CATEGORY_LINK = "//div[@class='filter-item-name' and text()='Blog']";
    private static final String POPUP_LINK_TO_PAGE = "//*[@class='link-title' and contains(text(), '%s')]";

    public HomePage(WebDriver driver) {
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

    public void clickOnSearch() {
        findElement(By.xpath(SEARCH_LINK)).click();
    }

    public WebElement getSearchPopup() {
        return findElement(By.xpath(SEARCH_POPUP));
    }

    public void fillSearchInput(String query) {
        findElement(By.xpath(SEARCH_INPUT)).sendKeys(query, Keys.ENTER);
    }

    public void clickOnCategoryLink() {
        findElement(By.xpath(CATEGORY_LINK)).click();
    }

    public void clickOnPopupLinkToPage(String articleName) {
        findElement(By.xpath(format(POPUP_LINK_TO_PAGE, articleName))).click();
    }
}



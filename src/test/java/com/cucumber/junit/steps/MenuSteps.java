package com.cucumber.junit.steps;

import com.cucumber.junit.manager.PageFactoryManager;
import com.cucumber.junit.pages.DocsPage;
import com.cucumber.junit.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuSteps {
    private static final String CUCUMBER_URL = "https://cucumber.io/";

    HomePage homePage;
    DocsPage docsPage;


    @When("the user opens Cucumber website")
    public void openCucumberWebsite() {
        homePage = PageFactoryManager.getHomePage();
        homePage.openCucumberWebsite(CUCUMBER_URL);
    }

    @When("the user clicks on the {string} section")
    public void clickOnTheSection(String section) {
        homePage.menuSection(section).click();
    }

    @When("the user clicks on the {string} item")
    public void clickOnTheItem(String item) {
        homePage.childMenuItem(item).click();
    }

    @Then("page with title {string} is displayed")
    public void verifyPagePresence(String pageTitle) {
        docsPage = PageFactoryManager.getDocsPage();
        docsPage.waitForPageLoadComplete(10);
        assertThat(docsPage.isPageWithTitleDisplayed(pageTitle))
                .overridingErrorMessage("Page with title '%s' is not displayed", pageTitle)
                .isTrue();
    }
}

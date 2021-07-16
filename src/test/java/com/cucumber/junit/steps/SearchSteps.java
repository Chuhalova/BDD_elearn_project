package com.cucumber.junit.steps;

import com.cucumber.junit.manager.PageFactoryManager;
import com.cucumber.junit.pages.ArticlePage;
import com.cucumber.junit.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.HashMap;

public class SearchSteps {
    HomePage homePage;
    ArticlePage articlePage;

    @When("the user clicks on search input")
    public void clickingOnSearchInput() {
        homePage = PageFactoryManager.getHomePage();
        homePage.clickOnSearch();
        homePage.waitVisibilityOfElement(10, homePage.getSearchPopup());
    }

    @And("user enter {string} in search input")
    public void enteringInSearchInput(String query) throws InterruptedException {
        homePage.fillSearchInput(query);
        homePage.implicitWait(10);
    }

    @And("user clicks on blog filter")
    public void clickingOnBlogFilter() throws InterruptedException {
        homePage.clickOnCategoryLink();
    }

    @And("User opens the first source with {string}")
    public void openingTheFirstSourceWith(String articleName) {
        homePage.clickOnPopupLinkToPage(articleName);
        articlePage = PageFactoryManager.getArticlePage();
        articlePage.waitForPageLoadComplete(10);
    }

    @Then("User checks that page with the title {string} has opened")
    public void checkingThatPageWithTheTitleHasOpened(String articleName) {
        Assert.assertTrue(articlePage.getTitle().equals(articleName));
    }
}

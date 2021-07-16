package com.cucumber.junit.steps;

import com.cucumber.junit.manager.PageFactoryManager;
import com.cucumber.junit.pages.DocsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DocsSteps {
    DocsPage docsPage;

    @Then("there are {int} items in the lest-side menu")
    public void checkItemsInTheLestSideMenu(int quantity) {
        docsPage = PageFactoryManager.getDocsPage();
        docsPage.waitForPageLoadComplete(10);
        Assertions.assertThat(docsPage.getMenuItemTitles())
                .as("The left-side menu size is not as expected")
                .hasSize(quantity);
    }

    @Then("left-site menu contains the following links")
    public void leftSiteMenuContainsTheFollowingLinks(List<String> expectedTitles) {
        Assertions.assertThat(docsPage.getMenuItem())
                .extracting(WebElement::getText)
                .as("Some of the left-side menu items are not as expected")
                .containsAll(expectedTitles);
    }
}

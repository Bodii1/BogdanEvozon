package com.evozontest.steps.ui;

import com.evozontest.pages.ui.HomePage;
import com.evozontest.pages.ui.SearchPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchProductSteps {

    HomePage homePage;
    SearchPage searchPage;

    @Step
    public void openHomepage() {
        homePage.open();
    }

    @Step
    public void clickSearchField() {
        homePage.clickSearchTextField();
    }

    @Step
    public void searchTextField(String product) {
        homePage.setSearchTextField(product);
    }

    @Step
    public void clickSearchButtonStep() {
        homePage.clickSearchButton();
    }

    @Step
    public void openNewSeachPage(String product) {
        searchPage.withParameters(product);
    }

    @Step
    public void searchPageIsDisplay(String product) {
        Assert.assertTrue(searchPage.searchPageDisplayed(product));
    }

    @Step
    public void allProductsPage() {
        searchPage.listingAllProducts();
    }
}

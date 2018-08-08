package com.evozontest.steps.ui;

import com.evozontest.pages.ui.HomePage;
import com.evozontest.pages.ui.SearchByRandomProductPage;
import net.thucydides.core.annotations.Step;

public class ProductsSteps {

    HomePage homePage;
    SearchByRandomProductPage searchByRandomProductPage;

    @Step
    public void openHomepage() {
        homePage.open();
    }

//    @Step
//    public void newProducts() {
//          homePage.getNewProducts();
//          homePage.getRandomNewProduct();
//          homePage.getRandomCategory();
//          homePage.mouseOverSelectedCategory();
//          homePage.getRandomSubCategory();
//    }
//
//    @Step
//    public void randomCategory() {
//          homePage.getRandomCategory();
//          homePage.mouseOverSelectedCategory();
//    }

    @Step
    public void randomSubCategory() {
        homePage.selectSubCategory();
    }

    @Step
    public void clickProduct() {
        searchByRandomProductPage.clickOnARandomProduct();
    }
}

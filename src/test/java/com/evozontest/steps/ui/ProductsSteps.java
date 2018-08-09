package com.evozontest.steps.ui;

import com.evozontest.pages.ui.CartPage;
import com.evozontest.pages.ui.HomePage;
import com.evozontest.pages.ui.SearchByRandomProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class ProductsSteps extends ScenarioSteps {

    HomePage homePage;
    SearchByRandomProductPage searchByRandomProductPage;
    CartPage cartPage;

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
    public void randomByCategory() {
        homePage.selectCategory();
    }

    @Step
    public void randomBySubCategory() {
        homePage.selectSubCategory();
    }

    @Step
    public void clickProduct() {
        searchByRandomProductPage.clickOnARandomProduct();
    }

    @Step
    public void setRequiredFields() {
        searchByRandomProductPage.selectRequiredFields();
    }

    @Step
    public void checkProductNameFromCart() {
        Assert.assertTrue(cartPage.getSuccesMessage().contains("was added to your shopping cart."));
    }

    @Step
    public void deleteProductFromCart() {
        cartPage.deleteProductButton();
    }
}

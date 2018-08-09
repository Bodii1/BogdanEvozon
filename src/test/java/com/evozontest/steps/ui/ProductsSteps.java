package com.evozontest.steps.ui;

import com.evozontest.pages.ui.CartPage;
import com.evozontest.pages.ui.HomePage;
import com.evozontest.pages.ui.SearchByRandomProductPage;
import com.evozontest.pages.ui.WishListPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class ProductsSteps extends ScenarioSteps {

    HomePage homePage;
    SearchByRandomProductPage searchByRandomProductPage;
    CartPage cartPage;
    WishListPage wishListPage;

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
    public void clickOnWishListButton() {
        searchByRandomProductPage.clickWishListButton();
    }

    @Step
    public void getSuccessMessageWishList() {
        Assert.assertTrue(wishListPage.getSuccessMessage().contains("has been added to your wishlist."));
        Assert.assertTrue(wishListPage.displaySuccessMessage());
    }

    @Step
    public void deleteProductFromWishList() {
        wishListPage.clickDeleteButton();
        getDriver().switchTo().alert().accept();
    }

    @Step
    public void deleteProductFromCart() {
        cartPage.deleteProductButton();
    }

    @StepGroup
    public void addARandomProduct() {
        openHomepage();
        randomByCategory();
        randomBySubCategory();
        clickProduct();
    }

    @StepGroup
    public void addToCartRandomProduct() {
        setRequiredFields();
        checkProductNameFromCart();
        deleteProductFromCart();
    }

    @StepGroup
    public void addToWishListRandomProduct() {
        clickOnWishListButton();
        getSuccessMessageWishList();
        deleteProductFromWishList();
    }
}

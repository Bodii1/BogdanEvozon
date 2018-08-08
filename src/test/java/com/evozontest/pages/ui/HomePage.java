package com.evozontest.pages.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.yecht.Data;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static com.evozontest.utils.Constants.BASE_URL;

@DefaultUrl(BASE_URL)
public class HomePage extends PageObject {

    @FindBy(css = "div.product-info h3 a ")
    private List<WebElementFacade> newProductsListing;

    @FindBy(css = "#nav ol > li")
    private  List<WebElementFacade> navigationHeadListing;

    @FindBy(css = "#search")
    private WebElementFacade searchTextField;

    @FindBy(css = "#search_mini_form div button")
    private WebElementFacade searchButton;

    @FindBy(css = "div.product-name span")
    private WebElementFacade productName;

    private  List<WebElementFacade> subCategoryListing;

    private int randomValueCategory;
    private int randomValueSubcategory;

    public void getRandomNewProduct() {
        Random random = new Random();
        int randomValue = random.nextInt(newProductsListing.size());
        String randomProduct = newProductsListing.get(randomValue).getText();
        System.out.println(randomProduct);
        newProductsListing.get(randomValue).click();
        String productNameString = productName.getText();
        Assert.assertTrue(randomProduct.contains(productNameString));
    }

//    public void getNewProducts() {
//         for(WebElementFacade product: newProductsListing)
//             System.out.println(product.getText());
//    }

    public void clickSearchTextField() {
        searchTextField.click();
    }

    public void setSearchTextField(String searchTextInputField) {
        searchTextField.sendKeys(searchTextInputField);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void selectSubCategory() {
        Random randomCategory = new Random();
        randomValueCategory = randomCategory.nextInt(navigationHeadListing.size());
        //navigationHeadListing.get(randomValue).click();
        Actions hover = new Actions(getDriver());
        hover.moveToElement(navigationHeadListing.get(randomValueCategory)).build().perform();

        subCategoryListing = navigationHeadListing.get(randomValueCategory).thenFindAll(By.cssSelector("nav ol > li ul >li"));
        Random randomSubCategory = new Random();
        randomValueSubcategory = randomSubCategory.nextInt(subCategoryListing.size());
        subCategoryListing.get(randomValueSubcategory).click();
    }

//    public void mouseOverSelectedCategory() {
//
//    }
//
//    public void getRandomSubCategory() {
//        Random random = new Random();
//        randomValueSubcategory = random.nextInt(subCategoryListing.size());
//        subCategoryListing.get(randomValueSubcategory).click();
//
//    }

//    public void clickAdminLoginButton() {
//        evaluateJavascript("jQuery.noConflict();");
//
//    }
}

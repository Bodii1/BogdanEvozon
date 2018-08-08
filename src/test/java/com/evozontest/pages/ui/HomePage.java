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
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import static com.evozontest.utils.Constants.BASE_URL;

@DefaultUrl(BASE_URL)
public class HomePage extends PageObject {

    @FindBy(css = "div.product-info h3 a ")
    private List<WebElementFacade> newProductsListing;

    @FindBy(css = "#nav ol > li")
    private  List<WebElementFacade> categoryListing;

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

    public void clickSearchTextField() {
        searchTextField.click();
    }

    public void setSearchTextField(String searchTextInputField) {
        searchTextField.sendKeys(searchTextInputField);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void selectCategory() {
        int min = 0;
        randomValueCategory = ThreadLocalRandom.current().nextInt(min,categoryListing.size());
        if(randomValueCategory == 5) {
            categoryListing.get(5).click();
        }
        else {
            Actions hover = new Actions(getDriver());
            hover.moveToElement(categoryListing.get(randomValueCategory)).build().perform();
        }
    }

    public void selectSubCategory() {
        int min = 1;
        if(randomValueCategory == 5) {
            categoryListing.get(5).click();
        }
        else {
            subCategoryListing = categoryListing.get(randomValueCategory).thenFindAll(By.cssSelector("nav ol > li ul >li"));
            randomValueSubcategory = ThreadLocalRandom.current().nextInt(min,subCategoryListing.size());
            subCategoryListing.get(randomValueSubcategory).click();
        }
    }
}

package com.evozontest.pages.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SearchByRandomProductPage extends PageObject {

    @FindBy(css = ".products-grid > li")
    private List<WebElementFacade> allProducts;

    @FindBy(css = "div.product-options")
    private WebElementFacade productOptions;

    @FindBy(css = "#configurable_swatch_color li")
    private List<WebElementFacade> colorOptions;

    @FindBy(css = "#configurable_swatch_size li")
    private List<WebElementFacade> sizeOptions;

    @FindBy(css = "div.add-to-cart-buttons span span")
    private WebElementFacade addToCartButton;

    @FindBy(css = "#downloadable-links-list li")
    private List<WebElementFacade> downloadableLinkOptions;

    @FindBy(css = "#configurable_swatch_shoe_size")
    private List<WebElementFacade> shoesSizeOptions;

    @FindBy(css = "#bundle-option-24")
    private List<WebElementFacade> bundleOptionsOne;

    @FindBy(css = "#bundle-option-23")
    private List<WebElementFacade> bundleOptionsTwo;

    @FindBy(css = "div.product-shop .product-name span")
    private WebElementFacade productName;

    private int randomValueProduct;
    private int randomColor;
    private int randomSize;
    private int randomDownloadable;
    private int randomShoesSize;
    public String expectedProductName;
    //private int randomBundleOne;
    //private int randomBundleTwo;

    public void clickOnARandomProduct() {
        randomValueProduct = ThreadLocalRandom.current().nextInt(allProducts.size());
        allProducts.get(randomValueProduct).click();
    }

    public void selectRequiredFields() {

        if(productOptions.isPresent()) {
            if(productOptions.findElements(By.cssSelector("#configurable_swatch_color li")).size() != 0) {
                randomColor = ThreadLocalRandom.current().nextInt(colorOptions.size());
                colorOptions.get(randomColor).click();
            }
            if(productOptions.findElements(By.cssSelector("#configurable_swatch_size li")).size() != 0) {
                randomSize = ThreadLocalRandom.current().nextInt(sizeOptions.size());
                sizeOptions.get(randomSize).click();
            }
            if(productOptions.findElements(By.cssSelector("#downloadable-links-list li")).size() != 0) {
                randomDownloadable = ThreadLocalRandom.current().nextInt(downloadableLinkOptions.size());
                downloadableLinkOptions.get(randomDownloadable).click();
            }
            if(productOptions.findElements(By.cssSelector("#configurable_swatch_shoe_size")).size() != 0) {
                randomShoesSize = ThreadLocalRandom.current().nextInt(shoesSizeOptions.size());
                shoesSizeOptions.get(randomShoesSize).click();
            } addToCartButton.click();
            /*if(productOptions.findElements(By.cssSelector("#bundle-option-24 li")).size() != 0) {
                randomBundleOne = ThreadLocalRandom.current().nextInt(1,bundleOptionsOne.size());
                bundleOptionsOne.get(randomBundleOne).click();
                if(productOptions.findElements(By.cssSelector("#bundle-option-23 li")).size() != 0) {
                    randomBundleTwo = ThreadLocalRandom.current().nextInt(1,bundleOptionsTwo.size());
                    bundleOptionsTwo.get(randomBundleTwo).click();
                }
            }*/
        }
        else {
            addToCartButton.click();
        }
    }


}

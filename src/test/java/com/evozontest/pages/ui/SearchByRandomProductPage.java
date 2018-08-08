package com.evozontest.pages.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SearchByRandomProductPage extends PageObject {

    @FindBy(css = ".products-grid > li")
    private List<WebElementFacade> allProducts;

    @FindBy(css = "div.product-options")
    private WebElementFacade productOptions;

    private int randomValueProduct;

    public void clickOnARandomProduct() {
        int min = 0;

        randomValueProduct = ThreadLocalRandom.current().nextInt(min,allProducts.size());
        allProducts.get(randomValueProduct).click();
    }

    public void requiredFields() {

        if(productOptions.isEnabled()) {

        }
    }
}

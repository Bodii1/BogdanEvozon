package com.evozontest.pages.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.Random;

public class SearchByRandomProductPage extends PageObject {

    @FindBy(css = ".products-grid > li")
    private List<WebElementFacade> allProducts;

    private int randomValueProduct;

    public void clickOnARandomProduct() {
        Random randomProduct = new Random();

        randomValueProduct = randomProduct.nextInt(allProducts.size());
        allProducts.get(randomValueProduct).click();

    }
}

package com.evozontest.pages.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CartPage extends PageObject {

    @FindBy(css = "td.product-cart-info > h2")
    private WebElementFacade productNameFromCartPage;

    @FindBy(css = "div.cart > ul > li span")
    private WebElementFacade successMessage;

    @FindBy(css = "td.a-center.product-cart-remove.last a")
    private WebElementFacade deleteProduct;

    public String getProductNameFromCartPage() {
        return productNameFromCartPage.getText();
    }

    public String getSuccesMessage() {
        return successMessage.getText();
    }

    public void deleteProductButton() {
        deleteProduct.click();
    }
}

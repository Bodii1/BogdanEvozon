package com.evozontest.pages.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class WishListPage extends PageObject {

    @FindBy(css = ".success-msg li span")
    private WebElementFacade successMessageWishList;

    @FindBy(css = " td.wishlist-cell5.customer-wishlist-item-remove.last  a")
    private WebElementFacade deleteButton;

    public String getSuccessMessage() {
        return successMessageWishList.getText();
    }

    public boolean displaySuccessMessage() {
        return successMessageWishList.isDisplayed();
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }
}

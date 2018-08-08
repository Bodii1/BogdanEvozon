package com.evozontest.pages.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import net.thucydides.core.pages.PageObject;

import java.util.List;

import static com.evozontest.utils.Constants.BASE_URL;

@DefaultUrl(BASE_URL)
@NamedUrls(
        {
                @NamedUrl(name = "with_parameter", url = BASE_URL + "catalogsearch/result/{1}")
        }
)
public class SearchPage extends PageObject {
    @FindBy(css="#search")
    private WebElementFacade searchBar;

    @FindBy(css=".page-title > h1")
    private WebElementFacade title;

    @FindBy(css = "div.product-info h2")
    private List<WebElementFacade> productsListing;

    public void openWithParameter(String searchTerm)
    {
        this.open("with_parameter",withParameters("?q="+searchTerm));
    }

    public boolean searchPageDisplayed(String searchTerm)
    {
        return title.getText().contains(searchTerm);
    }

    public void listingAllProducts() {
        for(WebElementFacade product: productsListing)
            System.out.println(product.getText());
        
    }

}

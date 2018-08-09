package com.evozontest.tests.ui;

import com.evozontest.steps.ui.SearchProductSteps;
import com.evozontest.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Ignore;
import org.junit.Test;

public class SearchProduct extends BaseTest {

    private String product = "DRESS";

    @Steps
    SearchProductSteps searchProduct;

    @Test
    public void searchAProduct() {
        searchProduct.openHomepage();
        searchProduct.clickSearchField();
        searchProduct.searchTextField(product);
        searchProduct.clickSearchButtonStep();
        searchProduct.openNewSeachPage(product);
        searchProduct.searchPageIsDisplay(product);
        searchProduct.allProductsPage();
    }

}

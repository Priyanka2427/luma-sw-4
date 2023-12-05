package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenJacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();
    WomenJacketsPage womenPage = new WomenJacketsPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        //Mouse Hover on Tops
        homePage.mouseHoverOnTops();
        //Click on Jackets
        homePage.clickOnJackets();
        //Select Sort By filter “Product Name”
        womenPage.selectProductNameFilter("Product Name");
        Thread.sleep(3000);
        //Verify the products name display in alphabetical order
        Assert.assertEquals(womenPage.getProductList1(), womenPage.getProductList2());
        Thread.sleep(3000);
    }


    @Test
    public void verifyTheSortByPriceFilter() {
        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        //Mouse Hover on Tops
        homePage.mouseHoverOnTops();
        //Click on Jackets
        homePage.clickOnJackets();
        //Select Sort By filter “Price”
        womenPage.selectProductNameFilter("Price");

        //Verify the products price display in Low to High
        Assert.assertEquals(womenPage.getPriceList1(), womenPage.getPriceList2());


    }
}










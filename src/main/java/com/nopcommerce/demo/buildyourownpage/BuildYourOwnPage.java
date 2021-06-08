package com.nopcommerce.demo.buildyourownpage;
import com.nopcommerce.demo.desktoppage.Desktop;
import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourOwnPage extends Desktop {

    public void addProductToShoppingCart()throws InterruptedException{

       // Thread.sleep(3000);
        String expectedText = "Build your own computer";
        String actualText = getTextFromElement(By.xpath("//div[@class='overview']/div/child::h1"));
        Assert.assertEquals(expectedText,actualText);

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        selectByTextFromDropDown(By.id("product_attribute_1"),"2.2 GHz Intel Pentium Dual-Core E2200");
        //2.7.Select "8GB [+$60.00]" using Select class.
        selectByvalueFromDropDown(By.id("product_attribute_2"),"5");
        //2.8 Select HDD radio "400 GB [+$100.00]"
        clickOnElement(By.id("product_attribute_3_7"));
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        clickOnElement(By.id("product_attribute_4_9"));
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        clickOnElement(By.id("product_attribute_5_12"));
        //2.11 Verify the price "$1,475.00"
        String expectedPriceOnPage = "$1,475.00";
        String actualPriceonPage = getTextFromElement(By.xpath("//span[text()='$1,475.00']"));
        Assert.assertEquals(expectedPriceOnPage,actualPriceonPage);
        //2.12 Click on "ADD TO CARD" Button.
        clickOnElement(By.id("add-to-cart-button-1"));
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedTextOnPage = "The product has been added to your shopping cart";
        String actualTextOnPage = getTextFromElement(By.xpath("//p[text()='The product has been added to your ']"));
        Assert.assertEquals(expectedTextOnPage,actualTextOnPage);
    }
}

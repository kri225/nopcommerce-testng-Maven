package com.nopcommerce.demo.desktoppage;

import com.nopcommerce.demo.computerpage.Computer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import org.testng.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desktop extends Computer {

    public void addProductToTheCart() throws InterruptedException{

        selectMenu("Computers");
        Thread.sleep(2000);
        //click on desktop
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));
        // Select Sort By position "Name: A to Z"
        selectByTextFromDropDown(By.id("products-orderby"), "Name: A to Z");

        //click on add to cart
        Thread.sleep(2000);
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));



      /**  // desktoplist of products in its original order
        List<WebElement> deskTopList = driver.findElements(By.xpath("//div[@class='item-grid']//div/div/div[2]//child::h2"));

        List<String> productName = new ArrayList<>();

        for (WebElement deskTop : deskTopList) {
            productName.add(deskTop.getText());
        }

        List<String> tempList = new ArrayList<>();
        tempList.addAll(productName);

        Collections.sort(tempList);
        Collections.sort(productName,Collections.reverseOrder());
        System.out.println(productName);
        System.out.println(tempList);
        Assert.assertEquals(productName, tempList);



    }*/
}
}
package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.buildyourownpage.BuildYourOwnPage;
import com.nopcommerce.demo.computerpage.Computer;
import com.nopcommerce.demo.desktoppage.Desktop;
import com.nopcommerce.demo.homepage.TopMenu;
import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.demo.utility.Utility;
import org.testng.annotations.Test;

public class BuildYourOwnPageTest extends TestBase {

    TopMenu topmenu = new TopMenu();
    Computer computer = new Computer();
    Desktop desktop = new Desktop();
    BuildYourOwnPage build = new BuildYourOwnPage();

    @Test

    public void verifyShoppingCart()throws InterruptedException{

        computer.clickOnComputerAndSelectDesktop();
        computer.selectSortByPostition();
        desktop.addProductToTheCart();
        build.addProductToShoppingCart();
    }


}

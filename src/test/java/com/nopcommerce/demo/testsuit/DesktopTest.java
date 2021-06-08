package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.desktoppage.Desktop;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class DesktopTest extends TestBase {

    Desktop desktop = new Desktop();

    @Test

public void productArragedInAscendingOrder () throws InterruptedException{

    desktop.addProductToTheCart();
}


}

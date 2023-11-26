package magento;

import drivermanager.DriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrderService {
    private final PlaceOrderPage placeOrder;
    private final WebDriverWait wait ;
    public PlaceOrderService() {
        placeOrder = new PlaceOrderPage();
        this.wait =  DriverManager.getWait();
    }
    public void placeOrderClick(){
        wait.until(ExpectedConditions.invisibilityOf(placeOrder.getLoadingMask()));
        placeOrder.getBtn_placeOrder().click();
    }
}

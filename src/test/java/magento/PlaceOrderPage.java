package magento;

import drivermanager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
    @FindBy(className = "checkout")
    private WebElement btn_placeOrder;
    @FindBy(className = "loading-mask")
    private WebElement loadingMask;
    public PlaceOrderPage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebElement getBtn_placeOrder() {
        return btn_placeOrder;
    }

    public WebElement getLoadingMask() {
        return loadingMask;
    }


}

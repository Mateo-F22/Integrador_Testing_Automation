package magento;

import drivermanager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProceedCheckoutPage {
    @FindBy(id = "cart-totals")
    private   WebElement carTotals;

    @FindBy(tagName = "button")
    private List<WebElement> elements;
    public ProceedCheckoutPage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }
    public WebElement getCarTotals() {
        return carTotals;
    }

    public List<WebElement> getElements() {
        return elements;
    }
}

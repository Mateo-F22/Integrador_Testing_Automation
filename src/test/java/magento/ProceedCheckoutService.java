package magento;

import org.openqa.selenium.WebElement;

public class ProceedCheckoutService {
    private final ProceedCheckoutPage proceddCheckout;

    public ProceedCheckoutService() {
        proceddCheckout = new ProceedCheckoutPage();
    }

    public void checkout() {
        if (proceddCheckout.getCarTotals().isDisplayed()) {
            for (WebElement btn : proceddCheckout.getElements()) {
                if (btn.getAttribute("title").equals("Proceed to Checkout") && btn.isDisplayed() && btn.isEnabled()) {
                    btn.click();
                    break;
                }
            }
        }
    }
}

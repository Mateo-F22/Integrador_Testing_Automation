package magento;

import drivermanager.DriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class MagentoTest {
    @BeforeMethod
    public void setup() {
        DriverManager.create("chrome");
        DriverManager.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void compraTest() {
        SearchService searchService = new SearchService();
        searchService.searchPrenda("Radiant Tee");

        SelectOptionService options = new SelectOptionService();
        options.selectOptions("2");

        ProceedCheckoutService checkoutService = new ProceedCheckoutService();
        checkoutService.checkout();

        FillFormService form = new FillFormService();
       form.fillForm("Juan","Perez","QA","Avenida Falsa 1234","Miami","18",
              "34545","3054545888","correoPrueba@gmail.com");

       PlaceOrderService placeOrder = new PlaceOrderService();
       placeOrder.placeOrderClick();

       ValidationService validationService = new ValidationService();
       validationService.allValidations();
    }

//    @Test
//    public void selectPrenda() {
//        SelectOptionService options = new SelectOptionService();
//        options.selectOptions("2");
//    }
//
//    @Test
//    public void proceddCheckout() {
//        ProceedCheckoutService checkoutService = new ProceedCheckoutService();
//        checkoutService.checkout();
//    }
//
//    @Test
//    public void fillForm() {
//        FillFormService form = new FillFormService();
//        form.fillForm("Juan", "Perez", "QA", "Avenida Falsa 1234", "Miami", "18",
//                "34545", "3054545888", "correoPrueba@gmail.com");
//    }
//
//    @Test
//    public void placeOrder() {
//        PlaceOrderService placeOrder = new PlaceOrderService();
//        placeOrder.placeOrderClick();
//    }
//
//    @Test
//    public void validationOrder() {
//        ValidationService validationService = new ValidationService();
//        validationService.allValidations();
//    }


}

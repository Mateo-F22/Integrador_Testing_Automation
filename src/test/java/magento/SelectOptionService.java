package magento;

import drivermanager.DriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SelectOptionService {
private final SelectOptionsPage selectOptions;

    private final WebDriverWait wait ;
    public SelectOptionService() {
        selectOptions = new SelectOptionsPage();
        this.wait =  DriverManager.getWait();
    }
    public void selectPrenda(){
        selectOptions.selectPrenda().click();
    }
    public void setTalle(){
        selectOptions.getBtn_Talle().click();
    }
    public void setColor(){
        selectOptions.getBtn_Color().click();
    }
    public void setCantidad(String cantidad){
        selectOptions.getInput_Cantidad().clear();
        selectOptions.getInput_Cantidad().sendKeys(cantidad);
    }
    public void addToCart(){
        selectOptions.getBtn_AddToCart().click();
    }

    public void shoppigCart(){
        wait.until(ExpectedConditions.visibilityOf(selectOptions.getShoppingCartLink()));
        selectOptions.getShoppingCartLink().click();
    }
    public void selectOptions(String cantidad){
        selectPrenda();
        setTalle();
        setColor();
        setCantidad(cantidad);
        addToCart();
        shoppigCart();
    }

}

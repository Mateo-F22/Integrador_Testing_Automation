package magento;

import drivermanager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
public class SelectOptionsPage {
    @FindBy(className = "product-item-info")
    private List<WebElement> prendas;
    @FindBy(id = "option-label-size-143-item-169")
    private WebElement btn_Talle;
    @FindBy(id = "option-label-color-93-item-50")
    private WebElement btn_Color;
    @FindBy(id = "qty")
    private WebElement input_Cantidad;
    @FindBy(id = "product-addtocart-button")
    private WebElement btn_AddToCart;
    @FindBy(linkText = "shopping cart")
    private WebElement shoppingCartLink;

    public SelectOptionsPage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }
    public WebElement selectPrenda() {
        return prendas.get(0);
    }
    public WebElement getBtn_Talle() {
        return btn_Talle;
    }
    public WebElement getBtn_Color() {
        return btn_Color;
    }
    public WebElement getInput_Cantidad() {
        return input_Cantidad;
    }
    public WebElement getBtn_AddToCart() {
        return btn_AddToCart;
    }
    public WebElement getShoppingCartLink() {
        return shoppingCartLink;
    }

}

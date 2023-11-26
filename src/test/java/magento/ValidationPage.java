package magento;

import drivermanager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ValidationPage {
    @FindBy(className = "continue" )
    private WebElement btn_continueShopping;
    @FindBy(xpath = "//*[@id=\"registration\"]/div[2]/a")
    private WebElement btn_createAccount;
    @FindBy(className = "base")
    private WebElement titulo;
    @FindBy(className = "checkout-success")
    private WebElement container;
    public ValidationPage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebElement getBtn_continueShopping() {
        return btn_continueShopping;
    }
    public WebElement getBtn_createAccount() {
        return btn_createAccount;
    }
    public WebElement getTitulo() {
        return titulo;
    }
    public WebElement getContainer() {
        return container;
    }
}

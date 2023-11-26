package magento;

import drivermanager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ValidationService {
    private final ValidationPage validationPage;
    private final WebDriverWait wait ;
    public ValidationService() {
        validationPage = new ValidationPage();
        this.wait =  DriverManager.getWait();
    }

   public void validateContinueShopping (){
        wait.until(ExpectedConditions.visibilityOf(validationPage.getBtn_continueShopping()));
        Assert.assertTrue(validationPage.getBtn_continueShopping().isEnabled(),"El boton Continue Shopping no esta Habilitado!!");
    }
    public void validateCreateAccount(){
        wait.until(ExpectedConditions.visibilityOf(validationPage.getBtn_createAccount()));
        Assert.assertTrue(validationPage.getBtn_createAccount().isDisplayed(),"El boton Create Account no esta Visible!!");
    }
    public void validateTitle(){
        Assert.assertNotEquals(validationPage.getTitulo().getText(),
                "Thank you for purchase!", "El texto del Titulo no es el Esperado !!");
    }
    public void validateNumOrder(){
        WebElement parrafo = validationPage.getContainer().findElement(By.tagName("p"));
        String numOrder = (parrafo.getText().split(":")[1].trim()).split("\\.")[0];
        Assert.assertTrue(numOrder.matches("\\d+"),"El numero de orden no contiene numeros!!");
    }
    public void allValidations(){
        validateContinueShopping();
        validateCreateAccount();
        validateTitle();
        validateNumOrder();
    }
}

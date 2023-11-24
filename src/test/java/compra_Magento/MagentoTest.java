package compra_Magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class MagentoTest {
    @Test
    public void comprar(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
//        driver.manage().window().maximize();

        WebElement inputSearch = driver.findElement(
                By.id("search")
        );
        inputSearch.sendKeys("Radiant Tee");

        WebElement formSearch = driver.findElement(
                By.id("search_mini_form")
        );
        formSearch.submit();

        List<WebElement> prendas = driver.findElements(By.className("product-item-info"));
        WebElement radiantTee = prendas.get(0);
        radiantTee.click();

        WebElement btn_Talle= driver.findElement(By.id("option-label-size-143-item-169"));
        btn_Talle.click();

        WebElement btn_Color= driver.findElement(By.id("option-label-color-93-item-50"));
        btn_Color.click();

        WebElement input_Cantidad= driver.findElement(By.id("qty"));
        input_Cantidad.clear();
        input_Cantidad.sendKeys("2");

        WebElement btn_AddToCart= driver.findElement(By.id("product-addtocart-button"));
        btn_AddToCart.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement shoppingCartLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("shopping cart")));
        shoppingCartLink.click();

        WebElement carTotals = driver.findElement(By.id("cart-totals"));

        if(carTotals.isDisplayed()){
            List <WebElement> elementsCheckout = driver.findElements(By.tagName("button"));
            for (WebElement element: elementsCheckout) {
                if (element.getAttribute("title").equals("Proceed to Checkout") && element.isDisplayed() && element.isEnabled() ){
                    element.click();
                    break;
                }
            }
        }

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));

           wait3.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
           WebElement input_firstName=  driver.findElement(By.name("firstname"));
           input_firstName.sendKeys("Juan");
            WebElement input_lastName=  driver.findElement(By.name("lastname"));
            input_lastName.sendKeys("Perez");
            WebElement input_company=  driver.findElement(By.name("company"));
            input_company.sendKeys("QA");
            WebElement input_streetAddress=  driver.findElement(By.name("street[0]"));
            input_streetAddress.sendKeys("Avenida Falsa 345");
            WebElement input_city=  driver.findElement(By.name("city"));
            input_city.sendKeys("Miami");
            wait3.until(ExpectedConditions.presenceOfElementLocated(By.name("region_id")));
            Select select_states = new Select( driver.findElement(By.name("region_id")));
            select_states.selectByValue("18");
            WebElement input_postalCode=  driver.findElement(By.name("postcode"));
            input_postalCode.sendKeys("23210");
            WebElement input_phoneNumber=  driver.findElement(By.name("telephone"));
            input_phoneNumber.sendKeys("523466578001");
            wait3.until(ExpectedConditions.presenceOfElementLocated(By.className("radio")));
            WebElement input_checkbox=  driver.findElement(By.className("radio"));
            input_checkbox.click();
            WebElement input_email= driver.findElement(By.id("customer-email"));
            input_email.sendKeys("correoPrueba@gmail.com");
            WebElement btn_next=  driver.findElement(By.className("continue"));
            btn_next.click();

             wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading-mask")));
             WebElement btn_placeOrder=  driver.findElement(By.className("checkout"));
             btn_placeOrder.click();

            wait3.until(ExpectedConditions.visibilityOfElementLocated(By.className("continue")));
            WebElement btn_continueShopping = driver.findElement(By.className("continue"));
//            System.out.println("\033[34m boton id: "+btn_continueShopping);
            Assert.assertTrue(btn_continueShopping.isEnabled(),"El boton Continue Shopping no esta Habilitado!!");

            wait3.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"registration\"]/div[2]/a"))));
            WebElement btn_createAccount=driver.findElement(By.xpath("//*[@id=\"registration\"]/div[2]/a"));
//            System.out.println("\033[33m boton id: "+btn_createAccount);
            Assert.assertTrue(btn_createAccount.isDisplayed(),"El boton Create Account no esta Visible!!");

            WebElement titulo=driver.findElement(By.className("base"));
//            System.out.println("\033[36mTitulo tipo =>> "+titulo.getTagName()+" texto >>"+titulo.getText());
            Assert.assertNotEquals(titulo.getText(), "Thank you for purchase!", "El texto del Titulo no es el Esperado !!");

            WebElement container= driver.findElement(By.className("checkout-success"));
            WebElement parrafo = container.findElement(By.tagName("p"));
            String numOrder = (parrafo.getText().split(":")[1].trim()).split("\\.")[0];
            Assert.assertTrue(numOrder.matches("\\d+"),"El numero de orden no contiene numeros!!");
    }

}

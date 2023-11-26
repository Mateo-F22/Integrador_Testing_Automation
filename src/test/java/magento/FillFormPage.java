package magento;

import drivermanager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillFormPage {
    @FindBy(name = "firstname")
    private WebElement input_firstName;
    @FindBy(name = "lastname")
    private WebElement input_lastName;
    @FindBy(name = "company")
    private WebElement input_company;
    @FindBy(name = "street[0]")
    private WebElement input_streetAddress;
    @FindBy(name = "city")
    private WebElement input_city;
    @FindBy(name = "region_id")
    private WebElement select_states;
    @FindBy(name = "postcode")
    private WebElement input_postalCode;
    @FindBy(name = "telephone")
    private WebElement input_phoneNumber;
    @FindBy(className = "radio")
    private WebElement input_checkbox;
    @FindBy(id = "customer-email")
    private WebElement input_mail;

    @FindBy(className = "continue")
    private WebElement btn_next;

    public FillFormPage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebElement getInput_firstName() {
        return input_firstName;
    }

    public WebElement getInput_lastName() {
        return input_lastName;
    }

    public WebElement getInput_company() {
        return input_company;
    }

    public WebElement getInput_streetAddress() {
        return input_streetAddress;
    }

    public WebElement getInput_city() {
        return input_city;
    }

    public WebElement getSelect_states() {
        return select_states;
    }

    public WebElement getInput_postalCode() {
        return input_postalCode;
    }

    public WebElement getInput_phoneNumber() {
        return input_phoneNumber;
    }

    public WebElement getInput_checkbox() {
        return input_checkbox;
    }

    public WebElement getInput_mail() {
        return input_mail;
    }

    public WebElement getBtn_next() {
        return btn_next;
    }

}

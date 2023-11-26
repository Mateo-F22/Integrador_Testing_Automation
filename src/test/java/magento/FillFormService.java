package magento;

import drivermanager.DriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FillFormService {
    private final FillFormPage fillForm;
    private final WebDriverWait wait ;
    public FillFormService() {
        fillForm = new FillFormPage();
        this.wait =  DriverManager.getWait();
    }

    public void setFirstName(String firstName){
        wait.until(ExpectedConditions.visibilityOf(fillForm.getInput_firstName()));
        fillForm.getInput_firstName().sendKeys(firstName);
    }
   public void  setLastName(String lastName){
      fillForm.getInput_lastName().sendKeys(lastName);
   }
    public void  setCompany(String company){
        fillForm.getInput_company().sendKeys(company);
    }
    public void  setStreetAddress(String street){
       fillForm.getInput_streetAddress().sendKeys(street);
    }
    public void  setCity(String city){
       fillForm.getInput_city().sendKeys(city);
    }
    public void  setState(String state){
        wait.until(ExpectedConditions.visibilityOf(fillForm.getSelect_states()));
       Select select = new Select(fillForm.getSelect_states());
       select.selectByValue(state);
    }
    public void setPostalCode(String code){
        fillForm.getInput_postalCode().sendKeys(code);
    }
    public void  setPhone(String number){
       fillForm.getInput_phoneNumber().sendKeys(number);
    }
    public void  setCheckbox(){
        wait.until(ExpectedConditions.visibilityOf(fillForm.getInput_checkbox()));
        fillForm.getInput_checkbox().click();
    }
    public void  setMail(String mail){
       fillForm.getInput_mail().sendKeys(mail);
    }
    public void clickNext(){
        fillForm.getBtn_next().click();
    }
    public void fillForm(String firstName, String lastName,String company,String street,
                         String city,String state,String code,String number,String mail){
        setFirstName(firstName);
        setLastName(lastName);
        setCompany(company);
        setStreetAddress(street);
        setCity(city);
        setState(state);
        setPostalCode(code);
        setPhone(number);
        setCheckbox();
        setMail(mail);
        clickNext();
    }

}

package magento;

import drivermanager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    @FindBy(id = "search")
    private WebElement inputSearch;
    @FindBy(id = "search_mini_form")
    private WebElement formSearch;

    public SearchPage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebElement getInputSearch() {
        return inputSearch;
    }
    public WebElement getFormSearch() {
        return formSearch;
    }
}

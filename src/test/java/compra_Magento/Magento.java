package compra_Magento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class magento {
  public static void main (String [] args){
      System.out.println("\n>>> Hello World ! <<<");
      System.setProperty("webdriver.chrome.driver", "/src/test/resources/drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();

  }

}

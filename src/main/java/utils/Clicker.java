package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.ws.WebServiceException;

public class Clicker {
    WebDriver driver;

    public Clicker(WebDriver driver){ this.driver = this.driver;}

    public void clickElement(WebElement webElement){
        try {
            webElement.click();
        }
        catch (WebServiceException noclick){
            noclick.printStackTrace();
        }
    }

}

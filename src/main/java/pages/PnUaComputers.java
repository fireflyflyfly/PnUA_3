package pages;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Clicker;

public class PnUaComputers {
    WebDriver driver;
    Clicker clicker;

    public PnUaComputers(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static final String IT_SERVICES = ".//*[@class = 'column-wrapper'][4]/article[3]/div/div";
    @FindBy (xpath = IT_SERVICES)
    protected WebElement itServices;

    public String itServicesText(){
        String servicesText = itServices.getText();
        return servicesText;
    }



}

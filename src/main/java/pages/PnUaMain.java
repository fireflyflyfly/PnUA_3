package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Clicker;

public class PnUaMain {

    WebDriver driver;
    Clicker clicker;

    public PnUaMain(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.clicker = new Clicker(driver);
    }

    public static final String COMPUTERS_CATEGORY = ".//*[@class = 'pc-block'][1]/a";
    @FindBy (xpath = COMPUTERS_CATEGORY)
    protected WebElement computersCategoty;

    public void openComputersCategory(){
        this.clicker.clickElement(this.computersCategoty);
    }

}

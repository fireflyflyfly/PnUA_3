import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PnUaComputers;
import pages.PnUaMain;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class TestPnUa extends BaseOfPnUa {
    WebDriver driver;

    @BeforeMethod
    public void ssetupPage() throws Exception{
        this.pnUaMain = new PnUaMain(DriverFactory.getDriver());
        this.pnUaComputers = new PnUaComputers(DriverFactory.getDriver());
    }

    @Test
    public void verifyServicesCategory() throws Exception {
        pnUaMain.openComputersCategory();
        System.out.println(pnUaComputers.itServicesText());
        Assert.assertEquals(pnUaComputers.itServicesText(), "IT услуги");
    }
}

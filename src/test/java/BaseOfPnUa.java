import org.junit.Before;
import org.testng.annotations.BeforeMethod;
import pages.PnUaComputers;
import pages.PnUaMain;
import utils.Configuration;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class BaseOfPnUa extends Configuration {

    PnUaMain pnUaMain;
    PnUaComputers pnUaComputers;

    @BeforeMethod
    public void setup(){
        DriverFactory.setDriver(driverType);
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverFactory.getDriver().get(starterPage);
    }

}

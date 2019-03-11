import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    public RemoteWebDriver driver;

    public RemoteWebDriver initializeDriver() throws MalformedURLException, InterruptedException {
        driver = new RemoteWebDriver(new URL("http://hub:4444/wd/hub"), DesiredCapabilities.chrome());
        return driver;
    }
}

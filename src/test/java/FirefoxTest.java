import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static java.lang.Thread.sleep;

public class FirefoxTest {

    private RemoteWebDriver driver;

    @Before
    public void setUp() throws MalformedURLException, InterruptedException {
        driver = new RemoteWebDriver(new URL("http://hub:4444/wd/hub"), DesiredCapabilities.firefox());
    }

    @Test
    public void user_should_be_able_to_navigate_google() throws InterruptedException {
        driver.get("https://mail.google.com");

        driver.findElement(By.cssSelector("#identifierId")).sendKeys("kumar.vastav@gmail.com");
        driver.findElement(By.cssSelector("#identifierNext")).click();
        sleep(2000);

        Assert.assertNotNull(driver.findElement(By.cssSelector("#password")));
        Assert.assertTrue(driver.findElement(By.cssSelector("#profileIdentifier")).getText().equals("kumar.vastav@gmail.com"));
    }

    @After
    public void tearDown() {
        driver.close();
    }
}

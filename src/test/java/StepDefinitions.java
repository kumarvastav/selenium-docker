import com.google.common.util.concurrent.Uninterruptibles;
import cucumber.api.java.en.*;

import java.net.MalformedURLException;


public class StepDefinitions extends DriverManager {

    @Given("I have a configured Cucumber-JVM project")
    public void i_have_a_configured_Cucumber_JVM_project() throws MalformedURLException, InterruptedException {
        DriverManager driverManager = new DriverManager();
        driver = driverManager.initializeDriver();
        driver.get("http://mail.google.com");
        System.out.println(driver.getWindowHandle());
        System.out.println("TEST STARTED");
    }

    @When("I run it within my IDE")
    public void i_run_it_within_my_IDE() throws MalformedURLException {
        System.out.println("TEST IN PROGRESS");
    }

    @Then("I will be able to run connected step definitions")
    public void i_will_be_able_to_run_connected_step_definitions() throws MalformedURLException {
        System.out.println("TEST STOPPED");
        driver.close();
    }
}
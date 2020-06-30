package steps.hooks;

import framework.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

/**
 * @author Jean Carlo Rodriguez
 */

public class GlobalHooks {

    @Given("I go to the main page")
    public void iGoToTheMainPage() {
        WebDriver driver;
        driver = DriverManager.getInstance().getWebDriver();
        // go to main page
        driver.get("http://automationpractice.com/index.php");
    }

    @After
    public void afterExecution() {
        try {
            DriverManager.getInstance().quit();
        } catch (Exception e) {
            System.out.println("Unable to quit the driver " + e);
        }
    }
}

package steps.hooks;

import framework.DriverManager;
import io.cucumber.java.After;

/**
 * @author Jean Carlo Rodriguez
 */

public class GlobalHooks {
    @After(order = 1)
    public void afterExecution() {
        try {
            DriverManager.getInstance().quit();
        } catch (Exception e) {
            System.out.println("Unable to quit the driver " + e);
        }
    }
}

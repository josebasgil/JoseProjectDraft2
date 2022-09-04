package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.commonMethods;

public class hooks extends commonMethods {
    @Before
    public void start(){openBrowserAndLaunchApplication();}

    @After
    public void end(){closeBrowser();}
}

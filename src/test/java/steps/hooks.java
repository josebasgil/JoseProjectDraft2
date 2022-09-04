package steps;

import org.junit.After;
import org.junit.Before;

import static utils.commonMethods.closeBrowser;
import static utils.commonMethods.openBrowserAndLaunchApplication;

public class hooks {
    @Before
    public void start(){openBrowserAndLaunchApplication();}

    @After
    public void end(){closeBrowser();}
}

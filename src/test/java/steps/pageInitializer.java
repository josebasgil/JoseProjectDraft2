package steps;

import pages.loginPage;

public class pageInitializer {
    public static loginPage login;

    public static void initializePageObjects(){
        login = new loginPage();
    }
}

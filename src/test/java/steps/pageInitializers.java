package steps;

import pages.Story08JoseBasPage;
import pages.Story09JoseBasPage;
import pages.loginPage;

public class pageInitializers {
    public static loginPage login;

    public static Story08JoseBasPage addEmployeeDependent;

    public static Story09JoseBasPage addEmployeeWExperience;

    public static void initializePageObjects(){

        login = new loginPage();
        addEmployeeDependent = new Story08JoseBasPage();
        addEmployeeWExperience =  new Story09JoseBasPage();
    }
}

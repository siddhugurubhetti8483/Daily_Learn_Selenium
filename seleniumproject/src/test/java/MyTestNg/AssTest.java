package MyTestNg;

import org.testng.annotations.Test;

public class AssTest {
     @Test(groups = {"smoke"}, priority = 1)
    public void loginTest() {
        System.out.println("Executing login test");
    }

    @Test(groups = {"regression"}, priority = 2, dependsOnMethods = {"loginTest"})
    public void dashboardTest() {
        System.out.println("Executing dashboard test");
    }

    @Test(groups = {"smoke", "regression"}, priority = 3)
    public void logoutTest() {
        System.out.println("Executing logout test");
    }
}

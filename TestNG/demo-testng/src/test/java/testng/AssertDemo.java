package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.jspecify.annotations.Nullable;

public class AssertDemo {

    public static Object assertEquals;

    // Dummy login method (replace with real logic)
    public boolean login(String username, String password) {
        if(username.equals("user1") && password.equals("pass1")) return true;
        if(username.equals("user2") && password.equals("pass2")) return true;
        return false;
    }

    @DataProvider(name = "loginData")
    public Object[][] loginTestData() {
        return new Object[][] {
            { "user1", "pass1", true },     // valid
            { "user2", "pass2", true },     // valid
            { "user3", "wrongPass", false } // invalid
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, boolean expectedResult) {
        boolean result = login(username, password);
        assertEquals(result, expectedResult, "Login test failed!");
    }

   

}


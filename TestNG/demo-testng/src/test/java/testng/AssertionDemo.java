package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

    @Test
    void validateTitle(){
        String expTitle = "OrangeHRM";
        String actTitle = "OrangeORM";

        Assert.assertEquals(actTitle, expTitle);
    }
}

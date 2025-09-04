package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardSoftAssertion {
    @Test
    void hardasser(){
        System.out.println("first");

        Assert.assertEquals(1, 2);

        System.out.println("Second");
    }

    @Test   
    void softassrt(){
        System.out.println("soft1");

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(1, 2);
        //Assert.assertEquals(1, 2);

        System.out.println("soft2");
        sa.assertAll();
    }
}

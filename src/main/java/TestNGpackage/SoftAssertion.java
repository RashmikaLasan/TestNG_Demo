package TestNGpackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

    @Test
    public void testSum() {

        System.out.println("TestSum Method  Running");
        int result = SomeClassToTest.sumNumber(1, 2);

        SoftAssert saa = new SoftAssert();
        saa.assertEquals(result, 3);
        saa.assertAll();


        Assert.assertEquals(result, 3);


    }
}

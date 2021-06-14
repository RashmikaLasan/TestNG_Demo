package TestNGpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_One {
    SomeClassToTest someClassToTest;


    @Test
    public void testMethod1() {
        System.out.println("Running Test --> Test Method 1");
        int result = someClassToTest.sumNumber(1,2);
        Assert.assertEquals(result, 3);

    }

    @Test
    public void testMethod2() {
        System.out.println("Running Test --> Test Method 2");
        String expectedString = "Hello World";
        String result = someClassToTest.addString("Hello","World");
        Assert.assertEquals(result,expectedString);



    }

    @Test
    public void testMethod3() {
        System.out.println("Running Test --> Test Method 3");
        int[] expectedArray = {1,2,3,};
        int[] result = someClassToTest.getArray();
        Assert.assertEquals(result,expectedArray);


    }
}



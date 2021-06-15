package TestNGpackage;

import org.testng.annotations.*;

public class TestNG_BeforeClassAnotation2 {


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This runs before every method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This runs after evey method");
    }

    @Test
    public void testMethod1() {
        System.out.println("Running -- testMethod1");

    }

    @Test
    public void testMethod2() {
        System.out.println("Running -- testMethod2");

    }

    @BeforeClass
    public void setup() {
        System.out.println("Running -- BeforeClass");

    }

    @AfterClass
    public void cleanup() {
        System.out.println("Running -- AfterClass");

    }
}

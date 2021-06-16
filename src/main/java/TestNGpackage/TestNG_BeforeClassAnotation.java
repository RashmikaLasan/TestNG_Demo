package TestNGpackage;

import Base.BaseTestSuite;
import org.testng.annotations.*;

public class TestNG_BeforeClassAnotation extends BaseTestSuite {


    @BeforeMethod
    public void beforeMethod() {

        System.out.println("TestNG_BeforeClassAnotation---->This runs before every method");
    }

    @AfterMethod
    public void afterMethod() {

        System.out.println("TestNG_BeforeClassAnotation---->This runs after evey method");
    }

    @Test
    public void testMethod1() {
        System.out.println("TestNG_BeforeClassAnotation---->Running -- testMethod1");

    }

    @Test
    public void testMethod2() {

        System.out.println("TestNG_BeforeClassAnotation---->Running -- testMethod2");

    }

    @BeforeClass
    public void setup() {

        System.out.println("TestNG_BeforeClassAnotation---->Running -- BeforeClass");

    }

    @AfterClass
    public void cleanup() {

        System.out.println("Running -- AfterClass");

    }
}

package TestNGpackage;

import Base.BaseTestSuite;
import org.testng.annotations.*;

public class TestNG_BeforeClassAnotation2 extends BaseTestSuite {


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("2222TestNG_BeforeClassAnotation---->beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("22222TestNG_BeforeClassAnotation---->afterMethod");
    }

    @Test
    public void testMethod1() {
        System.out.println("22222TestNG_BeforeClassAnotation---->Running -- Test");

    }

    @Test
    public void testMethod2() {
        System.out.println("22222TestNG_BeforeClassAnotation -- testMethod2");

    }

    @BeforeClass
    public void setup() {
        System.out.println("22222TestNG_BeforeClassAnotation -- BeforeClass");

    }

    @AfterClass
    public void cleanup() {
        System.out.println("22222TestNG_BeforeClassAnotation -- AfterClass");

    }
}

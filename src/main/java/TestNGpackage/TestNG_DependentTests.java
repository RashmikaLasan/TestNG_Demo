package TestNGpackage;

import org.testng.annotations.*;

public class TestNG_DependentTests {


//    @BeforeMethod
//    public void beforeMethod() {
//
//        System.out.println("TestNG_DependentTests---->This runs before every method");
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//
//        System.out.println("TestNG_DependentTests---->This runs after evey method");
//    }

    @Test(dependsOnMethods = {"testMethod2"}, alwaysRun = true)
    public void testMethod1() {
        System.out.println("TestNG_DependentTests---->Running -- testMethod1");

    }

    @Test
    public void testMethod2() {

        System.out.println("TestNG_DependentTests---->Running -- testMethod2");

    }

    @Test(dependsOnMethods = {"testMethod1"})
    public void testMethod3() {

        System.out.println("TestNG_DependentTests---->Running -- testMethod3");

    }
//
//    @BeforeClass
//    public void setup() {
//
//        System.out.println("TestNG_DependentTests---->Running -- BeforeClass");
//
//    }
//
//    @AfterClass
//    public void cleanup() {
//
//        System.out.println("TestNG_DependentTests -- AfterClass");
//
//    }
}

package TestNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Priority {


    @BeforeClass
    public void setup() {

        System.out.println("BeforeClass");

    }


    @AfterClass
    public void cleanup() {

        System.out.println("AfterClass");
    }


    @Test(priority = 1)
    public void testMethod1() {
        System.out.println("Method1");

    }

    @Test(priority = 0)
    public void testMethod2() {
        System.out.println("Method2");

    }

    @Test(priority = 2)
    public void testMethod3() {
        System.out.println("Method3");

    }

}



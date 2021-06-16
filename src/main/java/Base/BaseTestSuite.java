package Base;

import org.testng.annotations.*;

public class BaseTestSuite {


    @BeforeClass
    public void beforeClass() {
        System.out.println("Base--->BeforeClass");

    }

    @AfterClass
    public void afterClass() {
        System.out.println("Base--->AfterClass");


    }


    @BeforeTest
    public void beforeTest() {
        System.out.println("Base--->beforeTest");


    }

    @AfterTest
    public void afterTest() {

        System.out.println("Base--->afterTest");

    }


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Base--->BeforeSuite");


    }

    @AfterSuite
    public void afterSuite() {

        System.out.println("Base--->AfterSuite");

    }

}

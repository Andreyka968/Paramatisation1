package info.dvad.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterClass;
public class ModelTest {
    @Test
    public void bTest() {
        System.out.println("I am the b test  class ModelTest, ! "+Thread.currentThread().getName());
    }

    @Test
    public void BTest() {
        System.out.println("I am the B test class ModelTest, ! "+Thread.currentThread().getName());
    }

    @Test
    public void ATest() {
        System.out.println("I am the A test class ModelTest, ! "+Thread.currentThread().getName());
    }

    @Test
    public void _Test() {
        System.out.println("I am the _ test class ModelTest, ! "+Thread.currentThread().getName());
    }

    @Test
    public void aTest() {
        System.out.println("I am the a test class ModelTest, ! "+Thread.currentThread().getName());
    }
    @AfterSuite
    public void aftersuite() {
        System.out.println("ModelTest  aftersuite " + Thread.currentThread().getName());
    }


    @BeforeGroups
    public void BeforeGroups() {
        System.out.println("I amt he test BeforeGroups class ModelTest, ! " + Thread.currentThread().getName());
    }

    @BeforeClass
    public void beforeclass() {
        System.out.println("ModelTest  beforeclass " + Thread.currentThread().getName());
    }

    @AfterClass
    public void afterclass() {
        System.out.println("ModelTest  afterclass " + Thread.currentThread().getName());
    }

}



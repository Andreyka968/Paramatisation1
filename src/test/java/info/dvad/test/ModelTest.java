package info.dvad.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


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

}



package info.dvad.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test(enabled = true)
public class PriorityTest {
    public void id1(){
        System.out.println("class is ::PriorityTest method ::id1 "+Thread.currentThread().getName());
    }
        public void id2(){
            System.out.println("class is ::PriorityTest method ::id2 "+Thread.currentThread().getName());
        }
    public void id3(){
        System.out.println("class is ::PriorityTest method ::id3 "+Thread.currentThread().getName());
    }
    public void id4(){
        System.out.println("class is ::PriorityTest method ::id4 "+Thread.currentThread().getName());
    }
    public void id5(){
        System.out.println("class is ::PriorityTest method ::id5 "+Thread.currentThread().getName());
    }
    @BeforeSuite
    public void BeforeeSuite(){System.out.println("class is ::PriorityTest method ::BeforeSuite "+Thread.currentThread().getName());
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("class is ::PriorityTest method ::BeforeClass "+Thread.currentThread().getName());}

    @AfterSuite
    public void AfterSuite(){
        System.out.println("class is ::PriorityTest method ::AfterSuite "+Thread.currentThread().getName());
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("class is ::PriorityTest method ::AfterClass "+Thread.currentThread().getName());
    }
}

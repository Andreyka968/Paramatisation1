package info.dvad.test;
import org.testng.annotations.*;


public class ComputerTest<groups> {

    @Test(groups = {"groupName,comGroup"})
    public void Apple() {
        System.out.println("info.dvad.test.ComputerTest::Apple @ "
                + Thread.currentThread().getName());
    }

    @Test(enabled = true ,groups = {"groupName"})
    public void Asser() {
        System.out.println("info.dvad.test.ComputerTest::Asser @ " + Thread.currentThread().getName());
    }

    @Test(groups = {"groupName"})
    public void Asus() {
        System.out.println("info.dvad.test.ComputerTest::Asus @ " + Thread.currentThread().getName());
    }

    @Test(groups = "{otherGroup,comGroup}")
    public void HP() {
        System.out.println("info.dvad.test.ComputerTest::HP @ " + Thread.currentThread().getName());
    }

    @Test(groups = {"otherGroup"})
    public void Samsung() {
        System.out.println("info.dvad.test.ComputerTest::Samsung @ " + Thread.currentThread().getName());
    }
}

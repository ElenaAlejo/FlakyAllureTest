
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Flaky;
@Flaky
public class TestNG {


    @Test
    @Flaky
    public void testNG(){
        int sum = TestAllure.addSum(1, 3);
        Assert.assertEquals(4, sum);
    }

    @Test
    @Flaky
    public void testNGFailure(){
        int sum = TestAllure.addSum(1, 3);
        Assert.assertEquals(3, sum);
    }
}

import org.junit.Assert;
import org.junit.Test;

import io.qameta.allure.Flaky;

public class Test1 {

    @Flaky
    @Test
    public void thisTestIsMarkedAsFlaky(){
        int sum = TestAllure.addSum(1, 3);
        Assert.assertEquals(4, sum);
    }
}

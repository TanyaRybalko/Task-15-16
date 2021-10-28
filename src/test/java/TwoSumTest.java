import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoSumTest {

    @Test
    public void TwoSum() {

        int[] expectedResult = new int[]{2, 6};

        TwoSum Check1 = new TwoSum();

        int[] actualResult = Check1.twoSum(new int[]{68, 5, 2, 100, 9, 12, 8}, 10);

        Assert.assertEquals(actualResult, expectedResult);

        System.out.println(Arrays.toString(expectedResult));
        System.out.println(Arrays.toString(actualResult));
    }
}

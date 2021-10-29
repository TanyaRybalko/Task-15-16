import org.junit.Assert;
import org.testng.annotations.Test;

public class SmallestDifferenceTest {

    @Test
    public void getSmallerDif() {

        int[] expectedResult = {8, 8};

        SmallestDifference Check = new SmallestDifference();
        int[] actualResult = Check.smallestDif(new int[]{8, 5, 2, 0, 9, 12, 8});

        Assert.assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    public void getSmallerDif1() {

        int[] expectedResult = {-55, -54};

        SmallestDifference Check1 = new SmallestDifference();
        int[] actualResult = Check1.smallestDif(new int[]{8, -55, 2, -54, -12});

        Assert.assertArrayEquals(actualResult, expectedResult);

    }






}

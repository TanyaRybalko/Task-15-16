import org.junit.Assert;
import org.testng.annotations.Test;


public class HalfHalfTest {



    @Test
    public void HalfTest(){

        boolean expectedResult = true;

        HalfHalf newCheck1 = new HalfHalf();

        boolean actualResult = newCheck1.HalfHalfCompare(new int[]{4, 6, 3, 7, 1, 2});

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void HalfTest2(){

        boolean expectedResult = false;

        HalfHalf newCheck2 = new HalfHalf();

        boolean actualResult = newCheck2.HalfHalfCompare(new int[]{4, 6, 3, 7, 9, 2});

        Assert.assertEquals(expectedResult, actualResult);

    }






}

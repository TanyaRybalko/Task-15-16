import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcSumTest {

    @Test
    public void getTest1(){

        boolean expectedResult = true;

        CalcSum firstTest = new CalcSum();
        boolean actualResult = firstTest.CalcSumOfHalfMassive(new int[] {1,4,5,1,5,4});

        System.out.println(actualResult);
        System.out.println(expectedResult);

        Assert.assertEquals(actualResult, expectedResult);

    }

    

    @Test
    public void getTest2(){

        boolean expectedResult = false;

        CalcSum firstTest = new CalcSum();
        boolean actualResult = firstTest.CalcSumOfHalfMassive(new int[] {1,22,5,1,5,13});

        System.out.println(actualResult);
        System.out.println(expectedResult);

        Assert.assertEquals(actualResult, expectedResult);

    }




}

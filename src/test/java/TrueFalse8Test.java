import org.testng.Assert;
import org.testng.annotations.Test;


public class TrueFalse8Test {

    @Test
    public void TrueFalseTest() {

        Boolean expectedResult = true;

        TrueFalse8 Check1 = new TrueFalse8();

        Boolean actualResult = Check1.twoMassive(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});

        Assert.assertEquals(actualResult, expectedResult);

    }
}

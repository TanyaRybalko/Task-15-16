public class CalcSum {

    public boolean CalcSumOfHalfMassive( int[] enterMassive) {

        boolean x = true;
        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i <= enterMassive.length / 2 -1 ; i++) {
            firstSum += enterMassive[i];
        }
        System.out.println(firstSum);

        for (int i = enterMassive.length / 2; i <= enterMassive.length-1; i++) {
            secondSum += enterMassive[i];
        }
        System.out.println(secondSum);
        if (firstSum == secondSum) {
            return true;

        } else {
            return false;
        }
    }
}

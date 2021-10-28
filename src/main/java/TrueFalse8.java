public class TrueFalse8 {


    public boolean twoMassive(int[] first, int[] second) {

        boolean x = true;


        if ((first.length > second.length) || first.length < second.length) {
            x = false;
        } else {

            if (first.length == second.length) {
                for (int i = 0; i <= first.length; i++) {
                    if (first[i] == second[i]) {
                        x = true;
                    }
                }
            }
        }
       return x;
    }
}


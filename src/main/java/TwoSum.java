public class TwoSum {

    public int[] twoSum(int[]array, int targetNumber){

        if(array != null) {


            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == targetNumber) {
                        return new int[]{i, j};
                    }

                }
            }
        }

      return new int[1];
    }
}

//public static int[] twoSum(int[] array, int targetNumber) {
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i]+array[j]==targetNumber){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{};
//    }
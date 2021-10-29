public class SmallestDifference {

    public int[] smallestDif(int[] array) {

        int[] arr = new int[2];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (Math.abs(array[i]-array[j])< min){
                    min = Math.abs(array[i]-array[j]);
                    arr[0]=array[i];
                    arr[1]=array[j];
                }
            }
        }
        return arr;
    }
}

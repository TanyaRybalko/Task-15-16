import java.util.Arrays;

public class HalfHalf {

    public boolean HalfHalfCompare (int[] array){

        int firstHalf = 0;
        int secondHalf = 0;

        System.out.println(Arrays.toString(array));

        for ( int i =0; i<array.length/2; i++){
            firstHalf += array[i];
        }
        System.out.println(firstHalf);

        for ( int i =array.length/2; i<array.length; i++){
            secondHalf += array[i];
        }
        System.out.println(secondHalf);

        if(firstHalf > secondHalf){
            return true;
        } else{
            return false;
        }
    }
}

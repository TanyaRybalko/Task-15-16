public class Bottles99 {


    public void Song() {

        for (int i = 100; i >= 0; --i) {
            if (i < 100 && i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (i - 1) + "bottles of beer on the wall.");
                System.out.println();
            } else {
                if (i == 1) {
                    System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
                    System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
                    System.out.println();
                } else {
                    if (i == 0) {
                        System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n" +
                                "Go to the store and buy some more, 99 bottles of beer on the wall.");
                    }
                }
            }
        }
    }
}

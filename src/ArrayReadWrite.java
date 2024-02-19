import java.util.Arrays;

public class ArrayReadWrite {
    public static void main(String[] args) {

        int[] myArray = {10, 20, 30, 40, 50};

        int firstElement = myArray[0];
        System.out.println(firstElement);

        int secondElement = myArray[1];
        System.out.println(secondElement);

        int lastElement = myArray[myArray.length - 1];
        System.out.println(lastElement);

        myArray[1] = 99;
        System.out.println(myArray[1]);
        System.out.println(myArray);  // gibt als Ergebnis nur die Speicheradresse aus --> [I@6acbcfc0 --> nicht wirklich brauchbar
        System.out.println(Arrays.toString(myArray)); // Ergebnis: [10, 99, 30, 40, 50]
    }
}

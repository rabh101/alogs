import java.util.Scanner;

public class A_001_IndexOfLargestElement{
    public static void main(String[] args) {
        int[] array = { 10, 5, 20, 8 };
        int retValue = 0;

        if ((retValue = indexOfLargestElement(array)) != -1) {
            // FIX: Print 'retValue' (the index) not 'array[retValue]' (the value)
            System.out.println("Index of largest element is: " + retValue);
        }
    }

    static int indexOfLargestElement(int[] array) {
        int index = 0;
        if (array.length == 0) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[index] < array[i]) {
                index = i;
            }
        }
        return index;
    }
}

import  java.util.Arrays;

public  class A_006_LeftRotateByOne {
    public static void main(String[] main) {

        int arr[] = {10, 30, 7, 8, 90};

        leftRotateByOne(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    static void leftRotateByOne(int[] arr, int len) {
        if (len == 1) return;

        int firstElement = arr[0];

        for (int i = 0; i < (len - 1); i++) {
            arr[i] = arr[i + 1];
        }
        arr[len - 1] = firstElement;

    }
}
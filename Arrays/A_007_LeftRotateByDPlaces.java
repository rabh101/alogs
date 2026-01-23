  import   java.util.Arrays;


public class A_007_LeftRotateByDPlaces
{
    public static void main(String [] args)
    {
        int arr[] = {10, 20, 30, 40, 70, 80};

        leftRotateByDPlaces(arr, 3);

        System.out.println(Arrays.toString(arr));

        leftRotateByDPlaces(arr, 3);

        System.out.println(Arrays.toString(arr));

    }

    public static void leftRotateByDPlaces(int [] arr, int d)
    {
        reverse(arr, 0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    public static void reverse(int [] arr, int first, int last)
    {
        int initialIndex = first, lastIndex = last;
        while(initialIndex <lastIndex)
        {
            int temp =arr[initialIndex];
            arr[initialIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
            initialIndex++;lastIndex--;
        }

    }
}
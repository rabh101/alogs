import java.util.Arrays;

public class A_005_RemoveDuplicateFromArray
{
    public  static void main(String args [])
    {
        int arr1 [] = {0,20,20,30,30,30,30,40};
        RemoveDuplicate(arr1, arr1.length);

        System.out.println(Arrays.toString(arr1));

    }

    //Time Complexity is o(n)
    static void RemoveDuplicate(int []arr, int n)
    {
        int index = 1;

        for(int i=1; i<n; i++)
        {
            if(arr[i] != arr[i-1]) {
              arr[index] = arr[i];
              index++;
            }
        }

        for(int i=index;i<n;i++)
            arr[index++] = 0;
    }
}
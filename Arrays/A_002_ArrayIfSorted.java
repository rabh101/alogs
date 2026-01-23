public class A_002_ArrayIfSorted
{
    public static void main(String [] args)
    {
        int arr[] = {8,12,45};
        int arr1[] = {8,11,11,15};
        int arr3 []= {34,54,2,56};

        boolean bResult = isArraySorted(arr, arr.length);
        System.out.println("Function to verify if Array is sorted  " + bResult);

        bResult = isArraySorted(arr1, arr1.length);
        System.out.println("Function to verify if Array is sorted  " + bResult);

        bResult = isArraySorted(arr3, arr3.length);
        System.out.println("Function to verify if Array is sorted  " + bResult);

    }

    static boolean isArraySorted(int []arr, int len )
    {
        boolean isSorted = true;

        if(len == 1) return isSorted;

        for(int i=1;i < len;i++)
        {
            if( arr[i] < arr[i-1])
            {
                isSorted = false; break;
            }
        }
        return  isSorted;
    }
}
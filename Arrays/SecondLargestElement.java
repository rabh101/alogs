
//Time Complexity of Solution is O(n)
class SecondLargestElement
{
    public  static void main(String [] args)
    {
        int index = 0;

        int arr1 [] = {10,5,8,20};
        index = SecondLargestELement(arr1,arr1.length);
        System.out.println("Second Largest ELement in given array is "
                + arr1[index]);

        int arr2 [] = {20,10,20,8,12};
        index =SecondLargestELement(arr2,arr2.length);
        System.out.println("Second Largest ELement in given array is "
                + arr2[index]);


        int arr3[] = {3,4,5,6};
        index = SecondLargestELement(arr3,arr3.length);
        System.out.println("Second Largest ELement in given array is "
                + arr3[index]);

    }

    //
    static int SecondLargestELement(int arr[] , int n)
    {
        int indexSecondLargest = -1;
        int indexlargestELement = 0;

        //For Second Largest element at least two elements must be there
        if( n < 2 ) return  -1;

        for(int i =1; i < n; i++)
        {
            if( arr[indexlargestELement] < arr[i])
            {
                indexSecondLargest = indexlargestELement;
                indexlargestELement = i;
            }
            else
            {
                if( arr[indexlargestELement] != arr[i])
                {
                    if( (indexSecondLargest == -1) ||
                            ( arr[indexSecondLargest] < arr[i]))
                        indexSecondLargest = i;
                }
            }
        }
        return  indexSecondLargest;
   }
}
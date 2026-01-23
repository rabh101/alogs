import java.util.Arrays;


public  class A_008_MoveZeroToEnd {
    public static void main(String [] args)
    {
        int arr [] = {0,10,0,23,0,0,30,0,54,0,32};

        MoveZeroToEnd(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void  MoveZeroToEnd(int [] arr)
    {
        int index = 0;

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i] != 0) {
                   arr[index] = arr[i];

                   if( i!=index)
                        arr[i] = 0;

                   index++;
            }

        }



    }
}
import java.util.Arrays;

//Time Complexity O(n)
 class A_004_ReverseAnArray
 {
     public  static void main(String args[])
     {
         int arr1 [] = {10,5,8,20};
         reverseArray(arr1, arr1.length);

         System.out.println(Arrays.toString(arr1));
     }

     static  void reverseArray(int arr[], int n )
     {
         int low = 0, high = (n-1);
         while(low < high)
         {
             int temp = arr[low];
             arr[low]= arr[high];
             arr [high] = temp;

             low++; high--;
         }
     }
 }
package Array;

import java.util.Arrays;

// write a java program to move all zeros to the end of the array while maintaining the order of non-zeros elements.

public class Move_zeros {
      public static void main(String[] args) {
         int arr[] = {0,1,0,3,12};
         int n = arr.length;
         int start = 0;
         int end = 0;
         while(end<n){
                  if(arr[end]!=0){
                        int temp = arr[end];
                        arr[end] = arr[start];
                        arr[start] = temp;
                        start++;
                        end++;
                  }else{
                        end++;
                  }
            }
            System.out.println(Arrays.toString(arr));

      }
}

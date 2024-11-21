package Array;

import java.util.Arrays;

// write a program to reverse the elements of a 1D array.


public class Reverse_array {
      public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            int end = arr.length-1;
            for(int i=0; i<arr.length/2; i++){
                  int temp = arr[i];
                  arr[i] = arr[end];
                  arr[end] = temp;
                  end--;
            } 
            System.out.println(Arrays.toString(arr));           
      }
}

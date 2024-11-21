package Array;

import java.util.HashSet;
import java.util.Set;

// write a java program to remove duplicates from a sorted 1D array.


public class Remove_duplicates {
      public static void main(String[] args) {
            int[] arr ={1,1,2,2,3,4,4};
            int j=0;
            for (int i = 0; i < arr.length-1; i++) {
                  if(arr[i]!=arr[i+1]){
                        arr[j++] = arr[i];
                  }
            }
            arr[j++] = arr[arr.length-1];
            for (int i = 0; i < j; i++) {
                  System.out.print(arr[i]+" ");
            }

            // second method using hashset
            System.out.println();
            System.out.println("using hashset");
            Set<Integer> mp = new HashSet<>();
            for (int i : arr) {
                  mp.add(i);
            }
            System.out.println(mp);

      }
}
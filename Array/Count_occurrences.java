package Array;

// write a program to count the occurrences of a given element in a 1D array.

public class Count_occurrences {
      public static void main(String[] args) {
            int[] arr = {1,2,3,2,4,3,5,6,7,2};
            int target = 2;
            int count = 0 ;
            for (int i : arr) {
                  if(target==i) count++;
            }

            System.out.println(count);
      }      
}

package Array;

// find the Largest Element in an Array


public class Largest_element {
      public static void main(String[] args) {
            int[] arr = {1,-6,-8,9,17,3};
            int Largest = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                  Largest = Math.max(Largest, arr[i]);
            }
            System.out.println(Largest);
      }      
}

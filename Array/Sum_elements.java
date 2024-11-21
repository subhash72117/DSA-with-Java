package Array;

// write a java program to calculate the sum of all elements in a 1D array.

public class Sum_elements {
      public static void main(String[] args) {
            int[] arr = {3,8,3,10,-2,20};
            int sum = 0;
            for (int i : arr) {
                  sum += i;
            }
            System.out.println(sum);
      }
}

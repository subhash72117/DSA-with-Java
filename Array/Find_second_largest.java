package Array;

// write a program to find the second largest element in a 1D array.

public class Find_second_largest {
      public static void main(String[] args) {
            int arr[] = {3,4,5,7,2,8};
            int first =Integer.MIN_VALUE , second = Integer.MIN_VALUE;
            for (int i : arr) {
                  if(first<i){
                        second = first;
                        first = i;
                        
                  } else if(second<i && first != i){
                        second = i;
                  }
            }
            
            System.out.println(second);
      }
}

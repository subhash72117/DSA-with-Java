package Array;

// write a program to check if a 1D array is sorted is ascending order.

public class Check_Array {
      public static void main(String[] args) {
            int arr[] = {1,2,3,4,5,1};
            boolean ans = true;
            for (int i = 0; i < arr.length-1; i++) {
                  if(arr[i]>arr[i+1]){
                        ans = false;
                        break;
                  }
            }
            System.out.println(ans);
      }
}

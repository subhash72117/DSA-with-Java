package Array;

public class Linear_search {
      public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            int find = 4;
            boolean ans = false;
            for (int i = 0; i < arr.length; i++) {
                  if(find==arr[i]) {
                        ans = true;
                  }
            }
            System.out.println(ans);
      }
      
}

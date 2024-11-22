package Array;

public class Search_position {
      public static int insert_position(int[] nums , int target){
            int left = 0 , right = nums.length -1;
        
            while(left <= right){
               int mid = (left + right)/2;
                if(nums[mid]==target) return mid;
                
                else if(nums[mid]>target){
                    right = mid -1;
                }else{
                    left = mid + 1;
                }
    
            }
            return left;
        }
      public static void main(String[] args) {
            int[] arr = {1,3,4,5,6,7};
            int target = 2;
            int n = insert_position(arr, target);
            System.out.println(n);

      }
}

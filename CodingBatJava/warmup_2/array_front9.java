package CodingBatJava.warmup_2;

public class array_front9 {
    public static boolean arrayFront9(int[] nums) {
        int n = nums.length;
        
        if(n > 4){
          for(int i = 0; i < 4; i++){
            if(nums[i] == 9){
              return true;
            }
          }
        }
        else{
          for(int i = 0; i < n; i++){
            if(nums[i] == 9){
              return true;
            }
          }
        }
        
        return false;
        
    }

    public static void main(String[] arguments){
        int[] nums = {1,2,9, 3, 4};
        int[] nums1 = {1, 2, 3, 4, 9};
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(arrayFront9(nums));
        System.out.println(arrayFront9(nums1));
        System.out.println(arrayFront9(nums2));
    }
}

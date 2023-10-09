package CodingBatJava.warmup_2;

public class array_123 {
    

    public static boolean array123(int[] nums) {
        int n = nums.length;
        
        if(n < 3){
          return false;
        }
        
        if(n % 2 == 0){
          for(int i = 0; i < n - 2; i++){
            if((nums[i] == 1) && (nums[i + 1] == 2) && (nums[i + 2] == 3)){
              return true;
            }
          }
        }
        if(n % 2 != 0){
          for(int i = 0; i < n - 2 ; i++){
            if((nums[i] == 1) && (nums[i + 1] == 2) && (nums[i + 2] == 3)){
              return true;
            }
          }
        }
        return false;
    }


    public static void main(String[] arguments){
        int nums[] = {1, 1, 2, 3, 1};
        int nums1[] = {1 , 1, 2, 4, 1};
        int nums2[] = {1, 1, 2, 1, 2, 3};
        System.out.println(array123(nums));
        System.out.println(array123(nums1));
        System.out.println(array123(nums2));
    }
}

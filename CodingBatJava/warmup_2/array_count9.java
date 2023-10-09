package CodingBatJava.warmup_2;

public class array_count9 {
    public static int arrayCount9(int[] nums) {
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
          if(nums[i] == 9){
            count += 1;
          }
        }
        
        return count;
    }


    public static void main(String[] arguments){
        int[] nums = {1,2,9};
        int[] nums1 = {1, 9, 9};
        int[] nums2 = {1, 9, 9, 3, 9};
        System.out.println(arrayCount9(nums));
        System.out.println(arrayCount9(nums1));
        System.out.println(arrayCount9(nums2));


    }
}

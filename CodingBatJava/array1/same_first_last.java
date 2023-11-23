//package CodingBatJava.array1;

public class same_first_last {
    

    public static boolean sameFirstLast(int[] nums) {
        int n = nums.length;
        
        if(n >= 1 && nums[0] == nums[n-1]){
          return true;
        }
        return false;
    }


    public static void main(String[] arguments){

        int nums[] = {1, 2, 3};
        System.out.println(sameFirstLast(nums));

        int nums1[] = {1, 2, 3, 1};
        System.out.println(sameFirstLast(nums1));

        int nums2[] = {1, 2, 1};
        System.out.println(sameFirstLast(nums2));
    }
}

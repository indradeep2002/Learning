package CodingBatJava.warmup_2;

public class array_667{

    public static int array667(int[] nums){
        if(nums.length < 2){
            return 0;
        }
          
        int count_6_7 = 0;
          
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 6 && nums[i + 1] == 6){
              count_6_7 += 1;
            }
            else if(nums[i] == 6 && nums[i+1] == 7){
              count_6_7 += 1;
            }
        }
          
         return count_6_7;
    }

    public static void main(String[] arguments){

        int[] nums1 = {6 , 6, 2};
        int[] nums2 = {6, 6, 2, 6};
        int[] nums3 = {6, 7, 2, 6};

        System.out.println(array667(nums1));
        System.out.println(array667(nums3));
        System.out.println(array667(nums2));

    }
}
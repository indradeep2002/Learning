package CodingBatJava.warmup_2;

public class no_triples {
    
    public static boolean noTriples(int[] nums) {
        if(nums.length < 3){
          
          return true;
        }
        
        for(int i = 0; i < nums.length - 2; i++){
          if(nums[i] == nums[i+1] && nums[i] == nums[i + 2]){
            return false;
          }
        }
        return true;
    }

    public static void main(String[] arguments){
        
        int[] nums1 = {1 , 1, 2, 2, 1};
        int[] nums2 = {1, 1, 2, 2, 2, 1};
        int[] nums3 = {1, 1, 1, 2, 2, 2, 1};

        System.out.println(noTriples(nums1));
        System.out.println(noTriples(nums2));
        System.out.println(noTriples(nums3));
    }
}

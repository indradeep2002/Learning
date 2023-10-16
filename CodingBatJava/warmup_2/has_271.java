package CodingBatJava.warmup_2;

public class has_271 {
    public static boolean has271(int[] nums) {
        if(nums.length < 3){
          return false;
        }
        
        for(int i = 0; i < nums.length - 2; i++){
          int val = nums[i];
          if((nums[i + 1] == val + 5) && (Math.abs(nums[i + 2] - (val - 1))) <= 2){
            return true;
          }
        }
        return false;
    }

    public static void  main(String[] arguments){
        int[] val1 = {1, 2,7, 1};

        int[] val2 = {1, 2, 8, 1};

        int[] val3 = {2, 7, 1};
        System.out.println(has271(val1));
        System.out.println(has271(val2));
        System.out.println(has271(val3));
    }
      
}

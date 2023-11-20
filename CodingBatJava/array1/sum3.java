package CodingBatJava.array1;

public class sum3 {
    
    public static int Sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public static void main(String[] arguments){

        int[] nums = {1, 2, 3};
        System.out.println(Sum3(nums));
    }
}

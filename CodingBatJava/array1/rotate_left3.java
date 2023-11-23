//package CodingBatJava.array1;

public class rotate_left3{

    public static int[] rotateLeft3(int[] nums) {
        int ans[] = {nums[1] , nums[2], nums[0]};
        return ans;
    }

    public static void main(String[] arguments){

        int[] a = {1 , 2, 3};

        System.out.println(rotateLeft3(a));
    }
}
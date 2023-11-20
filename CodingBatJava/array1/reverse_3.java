package CodingBatJava.array1;

public class reverse_3 {
    
    public static int[] reverse3(int[] nums) {
        int[] ans = {nums[2] , nums[1], nums[0]};
        
        return ans;
    }

    public static void main(String[] arguments){

        int[] a = {1, 2, 3};
        int[] b = {9 , 11, 5};
        System.out.println(reverse3(a));
        System.out.println(reverse3(b));
    }
}

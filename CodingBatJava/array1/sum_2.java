//package CodingBatJava.array1;

public class sum_2{

    public static int sum2(int[] nums) {
        int n = nums.length;
        
        if (n == 0){
          
          return 0;
        }
        else if(n == 1){
          
          return nums[0];
        }
        else{
          
          return nums[0] + nums[1];
        }
    }

    public static void main(String[] arguments){

        int a[] = {1 ,2 ,3};

        System.out.println(sum2(a));

        
    }
}
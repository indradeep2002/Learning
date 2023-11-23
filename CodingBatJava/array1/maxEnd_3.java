//package CodingBatJava.array1;

public class maxEnd_3 {
    
    public static int[] maxEnd3(int[] nums) {
  
        if( nums[0] > nums[2] ){
          
          int ans[] = {nums[0] , nums[0] , nums[0] };
          
          return ans;
        }
        else if(nums[2] > nums[0]){
          
          int ans[] = {nums[2] , nums[2], nums[2] };
          
          return ans;
        }
        else{
          
          int ans[] = {nums[0] , nums[0], nums[0] };
          return ans;
        }
    }

    public static void main(String[] arguments){

        int[] a = {1, 2, 3};
        int[] b = {11 , 5 , 9};

        System.out.println(maxEnd3(a));
        System.out.println(maxEnd3(b));
    }
}

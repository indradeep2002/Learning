package CodingBatJava.array1;

public class firstlast6 {
    

    public static boolean firstLast6(int[] nums) {
        int n = nums.length;
        
        if(n < 1){
          return false;
        }
        else if(nums[0] == 6){
          return true;
        }
        else if(nums[n-1] == 6){
          return true;
        }
        else{
          return false;
        }
    }


    public static void main(String[] arguments){

        int nums[] = {1 , 2, 6};
        System.out.println(firstLast6(nums));

        int nums2[] = {6, 1, 2, 3};
        System.out.println(firstLast6(nums2));

        int nums3[] = {13, 6, 1, 2, 3};
        System.out.println(firstLast6(nums3));
    }
}


public class middle_three{

    public static String middleThree(String str) {
        int n = str.length();
        
        int mid = (n / 2 );
        
        return ""+str.charAt(mid - 1)+str.charAt(mid)+str.charAt(mid+1);
    }

    public static void main(String[] arguments){

        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
    }
      
}
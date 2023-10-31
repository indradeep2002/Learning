

public class first_two {
    public static String firstTwo(String str) {
        if(str.length() < 2){
          return str;
        }
        String final_str = "";
        final_str += str.charAt(0);
        final_str += str.charAt(1);
        
        return   final_str;
    }

    public static void main(String[] arguments){

        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("ab"));
    }
}

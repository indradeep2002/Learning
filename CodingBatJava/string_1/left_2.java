

public class left_2 {
    
    public static String left2(String str) {
        if(str.length() <= 2){
          return str;
        }
        
        String first_two = "";
        String rest_str = "";
        
        first_two += str.charAt(0);
        first_two += str.charAt(1);
        
        for(int i = 2; i < str.length(); i++){
          rest_str += str.charAt(i);
        }
        
        return rest_str + first_two;
    }

    public static void main(String[] arguments){

        System.out.println(left2("Hello"));
        System.out.println(left2("Java"));
        System.out.println(left2("hi"));
    }
}



public class right_2 {
    
    public static String right2(String str) {
        if(str.length() <= 2){
           return str;
         }
             
         String last_two = "";
         String rest_str = "";
             
         last_two += str.charAt(str.length()-2);
         last_two += str.charAt(str.length()-1);
             
         for(int i = 0; i < str.length() - 2; i++){
           rest_str += str.charAt(i);
         }
             
         return last_two+rest_str;
    }

    public static void main(String[] arguments){

        System.out.println(right2("Hello"));
        System.out.println(right2("Java"));
        System.out.println(right2("hi"));
    }
    
     
}

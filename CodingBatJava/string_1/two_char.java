public class two_char {
    public static String twoChar(String str, int index) {
        if(str.length() <= 2){
          return str;
        }
        
        if(index >= str.length() - 1){
          String ans = str.substring(0,2);
          return ans;
        }
        else if(index < 0){
          String ans = str.substring(0,2);
          return ans;
        }
        else{
           String ans  = str.substring(index, index+2);
           return ans;
        }
       
      
        
    }

    public static void main(String[] arguments){

        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
    }
}

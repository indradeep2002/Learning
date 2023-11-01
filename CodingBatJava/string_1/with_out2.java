public class with_out2 {
    
    public static String without2(String str) {
        int n = str.length();
        if(n <= 1){
          return str;
        }
        
        if (n <= 2){
          return "";
        }
        
        String front = "" + str.substring(0,2);
        
        String back = "" + str.substring(n-2, n);
        
        if(front.equals(back)){
          String new_str = "";
          
          for(int i = 2; i < n; i++){
            
            new_str += str.charAt(i);
            
          }
          
          return new_str;
          
        }
        
        return str;
    }

    public static void main(String[] args) {
        
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("HI"));
    }
}

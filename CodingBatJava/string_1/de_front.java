public class de_front {
    
    public static String deFront(String str) {   
  
        String new_str = "";
        
        int n = str.length();
        
        for(int i = 0; i < n; i++){
          
          if(i == 0 && str.charAt(i) == 'a'){
            
            new_str += str.charAt(i);
          }
          else if(i == 1 && str.charAt(i) == 'b'){
            
            new_str += str.charAt(i);
          }
          else if(i == 0 && str.charAt(i) != 'a' ){
            continue;
          }
          else if(i == 1 && str.charAt(i) != 'b' ){
            continue;
          }
          else{
            new_str += str.charAt(i);
          }
          
        }
        
        return new_str;
    }

    public static void main(String[] args) {
        
        System.out.println(deFront("Hello"));
        System.out.println(deFront("Java"));
        System.out.println(deFront("away"));
    }
}

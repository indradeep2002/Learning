public class min_cat {
    
    public static String minCat(String a, String b) {
  
        int n1 = a.length();
        int n2 = b.length();
        
        if(n1 < n2){
          
          String new_Str = "";
          int diff = n2 - n1;
          
          
          for(int i = 0; i < n2; i++){
            
            if(i < diff){
              
              continue;
            }
            new_Str += b.charAt(i);
          }
          return a + new_Str;
        }
        else if(n1 > n2){
          
          String new_Str = "";
          int diff = n1 - n2;
          
          for(int i = 0; i < n1; i++){
            
            if(i < diff){
              
              continue;
            }
            new_Str += a.charAt(i);
          }
          
          return new_Str + b;
        }
        
        return a.concat(b);
    }

    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "Java"));
        System.out.println(minCat("java", "Hello"));
    }

}

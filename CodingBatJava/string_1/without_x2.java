public class without_x2 {
    

    public static String withoutX2(String str) {
        int n = str.length();
        
        if(n <= 1){
          return "";
        }
        
        String substr = str.substring(0,2);
        String ans = "";
        
        int subLen = substr.length();
        
        if(substr.contains("x")){
          
          for(int i = 0; i < n; i++){
            
            if(i <= subLen && str.charAt(i) != 'x'){
              ans += str.charAt(i);
            }
            else if(i >= subLen && str.charAt(i) == 'x'){
              ans +=str.charAt(i);
            }
            else if(i > subLen && str.charAt(i) != 'x'){
              ans += str.charAt(i);
            }
            else{
              continue;
            }
          }
          
          return ans;
        }
        
        return str;
    }

    public static void main(String[] arguments){

        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
    }
}


public class with_out_end2 {
    
    public static String withouEnd2(String str) {
        if(str.length() < 1){
          return str;
        }
        int n = str.length();
        String ans = "";
        
        for(int i = 1; i < n-1; i++){
          ans += str.charAt(i);
        }
        
        return ans;
    }

    public static void main(String[] arguments){

        System.out.println(withouEnd2("Hello"));
        System.out.println(withouEnd2("abc"));
        System.out.println(withouEnd2("ab"));
    }
}

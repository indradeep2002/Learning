public class last_two {
    
    public static String lastTwo(String str) {
        int n = str.length();
        if(n <= 1){
          return str;
        }
        String substr = str.substring(n-2,n);
        String new_str = "";
        
        for(int i = substr.length() - 1; i >= 0; i--){
          new_str += substr.charAt(i);
        }
        return str.substring(0, n - 2) + new_str;
    }

    public static void main(String[] arguments){

        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
        System.out.println(lastTwo("ab"));
    }
}

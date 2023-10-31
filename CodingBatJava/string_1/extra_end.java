

public class extra_end {
    public static String extraEnd(String str) {
        if(str.length() < 2){
          return str;
        }
        int n = str.length();
        String s = "";
        
        s += str.charAt(n - 2);
        s += str.charAt(n -1);
        
        return s + s + s;
    }

    public static void main(String[] arguments){
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
    }
}

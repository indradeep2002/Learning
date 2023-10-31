

public class first_half {
    public static String firstHalf(String str) {
        int n = str.length();
        int half = n / 2;
        int i = 0;
        String final_ans = "";
        
        while ( i < half){
          final_ans += str.charAt(i);
          i += 1;
        }
        
        return final_ans;
        
    }

    public static void main(String[] arguments){
        
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
    }
}

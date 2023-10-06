package CodingBatJava.warmup_2;

public class string_splosion {
    public static String stringSplosion(String str) {
        String final_str = "";
        String sub_str = "";
        for(int i = 0; i < str.length(); i++){
          sub_str = sub_str + str.charAt(i);
          final_str += sub_str;
        }
        
        return final_str;
    }

    public static void main(String[] arguemnts){
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }
}

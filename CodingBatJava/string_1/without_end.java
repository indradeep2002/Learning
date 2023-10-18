package CodingBatJava.string_1;

public class without_end {
    public static String withoutEnd(String str) {
        if (str.length() < 2){
          return str;
        }
        
        String mid_chars = "";
        
        int i = 1;
        
        while (i < str.length() - 1){
          mid_chars += str.charAt(i);
          i += 1;
        }
        
        return mid_chars;
    }

    public static void main(String[] arguments){
        
        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("Java"));
        System.out.println(withoutEnd("coding"));
    }
}

package CodingBatJava.warmup_1;

public class every_nth {
    public static String everyNth(String str, int n) {
        String new_string = "";
        
        if (n < 1){
          return str;
        }
        
        for(int i = 0; i < str.length(); i+= n){
          char c = str.charAt(i);
          new_string += c;
        }
        
        return new_string;
        
    }

    public static void main(String[] arguments){
        System.out.println(everyNth("Miracle", 2));
        System.out.println(everyNth("abcdefg", 2));
        System.out.println(everyNth("abcdefg", 3));
    }
}

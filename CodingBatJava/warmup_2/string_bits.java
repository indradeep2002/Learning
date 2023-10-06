package CodingBatJava.warmup_2;

public class string_bits {
    public static String stringBits(String str) {
        String new_str = "";
        for(int i = 0; i < str.length(); i += 2){
          new_str += str.charAt(i);
        }
        
        return new_str;
    }

    public static void main(String[]arguments){
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }
}

package CodingBatJava.warmup_2;

public class string_times {
    public static String stringTimes(String str, int n) {
        String new_str = "";
        for(int i = 0; i < n; i++){
          new_str += str;
        }
        return new_str;
    }

    public static void main(String[] arguments){
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("HI", 1));
        System.out.println(stringTimes("Hi", 3));
    }
}

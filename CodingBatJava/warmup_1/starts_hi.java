package CodingBatJava.warmup_1;

public class starts_hi {
    public static boolean startHi(String str) {
        if (str.startsWith("hi")){
          return true;
        }
        return false;
    }

    public static void main(String[] arguments){
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
    }
}

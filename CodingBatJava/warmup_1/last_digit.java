package CodingBatJava.warmup_1;

public class last_digit {
    public static boolean lastDigit(int a, int b) {
        if(a % 10 == b % 10){
          return true;
        }
        return false;
    }

    public static void main(String[] arguments){
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));
    }
}

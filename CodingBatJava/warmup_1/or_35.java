package CodingBatJava.warmup_1;

public class or_35 {
    public static boolean or35(int n) {
        if((n % 3 == 0) || (n % 5 == 0) || (n % 3 == 0 && n % 5 == 0)){
          return true;
        }
        return false;
    }

    public static void main(String[] arguments){
        System.out.println(or35(3));
        System.out.println(or35(10));
        System.out.println(or35(8));
    }
}

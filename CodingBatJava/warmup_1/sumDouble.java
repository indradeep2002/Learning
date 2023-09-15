package CodingBatJava.warmup_1;

public class sumDouble {
    public static int sum_double(int a , int b){
        if (a == b){
            return (2 * (a + b));
        }
        return (a + b);
    }


    public static void main(String[] arguments){
        System.out.println(sum_double(1, 2));
        System.out.println(sum_double(3, 2));
        System.out.println(sum_double(2, 2));
    }
}

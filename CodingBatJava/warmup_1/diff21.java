package CodingBatJava.warmup_1;

public class diff21 {
    public static int diff_21(int n){
        if (n > 21){
            return (2 * (n - 21));
        }
        return (21 - n);
    }


    public static void main(String[] arguments){
        System.out.println(diff_21(19));
        System.out.println(diff_21(10));
        System.out.println(diff_21(21));
    }
}

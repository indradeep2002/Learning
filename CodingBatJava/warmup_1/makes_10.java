package CodingBatJava.warmup_1;

public class makes_10 {
    public static boolean makes10(int a , int b){
        if( (a == 10) || (b == 10) || (a + b == 10) ){
            return true;
        }
        return false;
    }

    public static void main(String[] arguments){
        System.out.println(makes10(9 , 10));
        System.out.println(makes10(9 , 9));
        System.out.println(makes10(1, 9));
    }
}

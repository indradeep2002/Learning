package CodingBatJava.warmup_1;

public class int_max {
    public static int intMax(int a, int b, int c) {
        if(a > b && a > c){
          return a;
        }
        else if(b > a && b > c){
          return b;
        }
        else{
          return c;
        }
    }


    public static void main(String[] arguments){
        System.out.println(intMax(1, 2, 3) );
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1) );
    }
}

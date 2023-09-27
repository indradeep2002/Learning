package CodingBatJava.warmup_1;

public class has_teen {
    public static boolean hasTeen(int a, int b, int c) {
        if((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)){
          return true;
        }
        return false;
    }

    public static void main(String[] arguments){
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 10, 13));
    }
}

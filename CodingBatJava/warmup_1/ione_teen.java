package CodingBatJava.warmup_1;

public class ione_teen {
    public static boolean loneTeen(int a, int b) {
        if((a >= 13 && a <= 19) && (b >= 13 && b <= 19)){
          return false;
        }
        else if((a >= 13 && a <= 19) || (b >= 13 && b <= 19)){
          return true;
        }
        return false;
    }

    public static void main(String[] arguments){
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));
    }
}

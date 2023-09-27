package CodingBatJava.warmup_1;

public class icy_hot {
    public static boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100){
          return true;
        }
        else if(temp1 > 100 && temp2 < 0){
          return true;
        }
        return false;
    }

    public static void main(String[] arguments){
        System.out.println(icyHot(120, -1) );
        System.out.println(icyHot(-1, 120));
        System.out.println(icyHot(2, 120));
    }
}

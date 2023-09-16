package CodingBatJava.warmup_1;

public class pos_neg {
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative == false){
          if (a < 0 && b < 0){
            return false;
          }
          else if (a < 0 || b < 0){
            return true;
          }
          else{
            return false;
          }
        }
        else{
          if (a < 0 && b < 0){
            return true;
          }
          else{
            return false;
          }
        }
      }


      public static void main(String[] arguments){
        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(-4, -5, true));
      }
}

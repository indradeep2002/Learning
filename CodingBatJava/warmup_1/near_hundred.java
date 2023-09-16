package CodingBatJava.warmup_1;

public class near_hundred {
    public static boolean nearHundred(int n) {
        if(n < 0){
            return false;
          }
          else if(n < 90){
            return false;
          }
          else if(n < 190 && n > 110){
            return false;
          }
          else if (n > 210){
            return false;
          }
          else{
            return true;
          }
    }

    public static void main(String[] arguments){
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
    }
}

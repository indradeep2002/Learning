package CodingBatJava.warmup_1;

public class max_1020 {
    public static int max1020(int a, int b) {
        if(a > b){
          if(a >= 10 && a <= 20){
            return a;
          }
          else if(b >= 10 && b <= 20){
            return b;
          }
          else{
            return 0;
          }
        }
        else if(a < b){
          if(b >= 10 && b <= 20){
            return b;
          }
          else if(a >= 10 && a <= 20){
            return a;
          }
          else{
            return 0;
          }
        }
        return 0;
        
    }

    public static void main(String[] arguments){
        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9));
    }
}

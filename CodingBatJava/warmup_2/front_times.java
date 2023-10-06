package CodingBatJava.warmup_2;

public class front_times {
    public static String frontTimes(String str, int n) {
        String new_str = "";
        if(str.length() > 3){
          String sub_str = str.substring(0,3);
          for(int i = 0; i < n; i++){
            new_str += sub_str;
          }
          
          return new_str;
        }
        
        for (int j = 0; j < n; j++){
          new_str += str;
        }
        return new_str;
        
    }

    public static void main(String[] arguments){
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
    }

}

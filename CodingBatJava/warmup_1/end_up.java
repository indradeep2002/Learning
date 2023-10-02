package CodingBatJava.warmup_1;

public class end_up {
    public static String endUp(String str) {
        int n = str.length();
        if(n >= 3){
          String lst_3 = "";
          String first = "";
          
          for(int i = n -3; i <= n - 1; i++){
           char c = str.charAt(i);
           lst_3 += c;
          }
          
          for(int j = 0; j < n - 3; j++){
            char f = str.charAt(j);
            first += f;
          }
          
          String lst_3_upper = lst_3.toUpperCase();
          
          return first + lst_3_upper;
        }
        return str.toUpperCase();
    }

    public static void main(String[] arguments){
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));
    }
}

package CodingBatJava.warmup_1;

public class front_22 {
    public static String front22(String str) {
        if(str.length() > 2){
          String first_two = "";
          for(int i = 0; i < 2; i++){
            first_two += str.charAt(i);
          }
          return first_two + str + first_two;
        }
        else{
          return str + str + str;
        }
    }

    public static void main(String[] arguments){
        System.out.println(front22("kitten") );
        System.out.println(front22("Ha") );
        System.out.println(front22("abc"));
    }
}

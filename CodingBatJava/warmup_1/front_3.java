package CodingBatJava.warmup_1;

public class front_3 {
    public static String front3(String str) {
        if(str.length() < 3){
          return str+str+str;
        }
        else{
          String chars = "";
          for (int i = 0; i < 3; i++){
            chars += str.charAt(i);
          }
          return chars + chars + chars;
        }
    }

    public static void main(String[] arguments){
        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));

    }
}

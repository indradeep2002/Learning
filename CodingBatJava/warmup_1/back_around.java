package CodingBatJava.warmup_1;

public class back_around{

    public static String backAround(String str) {
        if(str.length() > 1){
          char last = str.charAt(str.length() - 1);
          return last + str + last;
        }
        else{
          return str + str + str;
        }
      }
      
      public static void main(String[] arguments){
        System.out.println(backAround("cat"));
        System.out.println(backAround("hello"));
        System.out.println(backAround("a"));
      }
}
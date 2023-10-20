package CodingBatJava.string_1;

public class combo_string {
    
    public static String comboString(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();
        
        if(n1 > n2){
          return b+a+b;
        }
        else if(n1 < n2){
          return a+b+a;
        }
        else{
          return a+b+a;
        }
    }

    public static void main(String[] arguments){

        System.out.println(comboString("Hello", "Hi"));
        System.out.println(comboString("hi", "hello"));
        System.out.println(comboString("aaa", "b"));
    }
      
}

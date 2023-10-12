package CodingBatJava.warmup_2;

public class string_x {
    

    public static String stringX(String str) {
        int n = str.length();
        String n1 = "";
        
        for(int i = 0; i < n; i++){
          if((i == 0 || i == n - 1) && str.charAt(i) == 'x'){
           n1 += str.charAt(i);
          }
          
          else if(i == 0 || i == n -1 || i < n && str.charAt(i) != 'x'){
            n1 += str.charAt(i);
          }
        }
        
        return n1;
    }

    public static void main(String[] arguments){
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }
}

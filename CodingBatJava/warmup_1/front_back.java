package CodingBatJava.warmup_1;

public class front_back {
    public static String frontBack(String str) {
        String first = "";
        String last = "";
        String mid = "";
        
        if(str.length() <= 1){
          return str;
        }
        else{
          for (int i = 0; i < str.length() ; i++){
            if(i == 0){
             first += str.charAt(0); 
            }
            else if( i == str.length() - 1){
              last += str.charAt(str.length() - 1);
            }
            else{
              mid += str.charAt(i);
            }
          }
          return last + mid + first;
        }
        
    }

    public static void main(String[] arguments){
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));

    }

}

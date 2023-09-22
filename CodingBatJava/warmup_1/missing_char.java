package CodingBatJava.warmup_1;

public class missing_char {
    public static String missingChar(String str, int n) {
        String newstr = "";
       for(int i = 0; i < str.length(); i++){
         if(i != n){
          newstr += str.charAt(i);
         }
       }
       return newstr;
    }

    public static void main(String[] arguments){
        System.out.println(missingChar("kitten",1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
    }
    
}

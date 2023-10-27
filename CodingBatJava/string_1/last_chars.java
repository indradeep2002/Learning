public class last_chars {
    public static String lastChars(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();
        
        if(n1 > 0 && n2 > 0){
          
          return ""+a.charAt(0)+b.charAt(n2 - 1);
        }
        else if(n1 == 0 && n2 > 0){
          return "@"+b.charAt(n2 - 1);
        }
        else if(n1 > 0 && n2 == 0){
          return ""+a.charAt(0)+"@";
        }
        else{
          return "@@";
        }
    }

    public static void main(String[] arguments){

        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
    }
      
}

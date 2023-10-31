

public class the_end {
    
    public static String theEnd(String str, boolean front) {
        int n = str.length();
        if(front){
          return ""+str.charAt(0);
        }
        return ""+str.charAt(n-1);
    }

    public static void main(String[] arguments){

        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hellow", false));
        System.out.println(theEnd("oh", true));
    }
      
}

public class at_first {
    public static String atFirst(String str) {
        int n = str.length();
        
        if(n >= 2){
          
          return ""+str.charAt(0)+str.charAt(1);
        }
        else if(n > 0){
          return ""+str.charAt(0)+"@";
        }
        return "@@";
        
    }

    public static void main(String[] arguments){

        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
    }
}

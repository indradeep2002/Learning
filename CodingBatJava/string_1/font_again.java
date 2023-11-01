public class font_again {
    public static boolean frontAgain(String str) {
  
        int n = str.length();
        
        if (n <= 1){
          return false;
        }
        
        
        String first_two = "" + str.substring(0,2);
        String last_two = "" + str.substring(n-2,n);
        
        return first_two.equals(last_two);
    }

    public static void main(String[] args) {
        
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
    }
}

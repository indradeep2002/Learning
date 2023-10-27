public class con_cat {
    public static String conCat(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();
        
        if (n1 == 0 || n2 == 0){
          return a + b;
        }
        else if((""+a.charAt(n1 - 1)).equals((""+b.charAt(0)))){
          
          return a + b.substring(1, n2);
        }
        else{
          return a + b;
        }
    }

    public static void main(String[] arguments){

        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));
    }
}

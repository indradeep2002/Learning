public class start_word{

    public static String startWord(String str, String word){

        int n = word.length();
  
        int n1 = str.length();
        
        if(n < 1){
          
          return "";
        }
        
        if(n1 < n){
          
          return "";
        }
        
        String substr = ""+ str.substring(0, n);
        
        if (substr.equals(word)){
          return substr;
        }
        else if(substr.substring(1, n).equals(word.substring(1,n))){
          return substr;
        }
        else{
          return "";
        }
    }



    public static void main(String[] arguments){

        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip"));
        System.out.println(startWord("hippo", "i"));
    }
}
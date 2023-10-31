

public class non_start {
    
    public static String nonStart(String a, String b) {
        String new_str = "";
        
        if (a.length() >= 1 && b.length() >= 1){
          for(int i = 1; i < a.length(); i++){
            new_str += a.charAt(i);
          }
          
          for (int j = 1; j < b.length(); j++){
            new_str += b.charAt(j);
          }
          
          return new_str;
        }
        else if(a.length() < 1 && b.length() >= 1){
          
          for (int j = 1; j < b.length(); j++){
            new_str += b.charAt(j);
          }
          
          return new_str + "";
        }
        else{
          return ""+"";
        }
    }

    public static void main(String[] arguments){

        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));
    }
}

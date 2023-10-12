package CodingBatJava.warmup_2;

public class string_match{

    public static int stringMatch(String a, String b) {
  
        int n1 = a.length();
        int n2 = b.length();
        int count = 0;
        
        if (n1 > 0 && n2 > 0){
          
          if(n2 < n1){
            String tar_str = "";
            for(int i = 0; i < n2-1 ; i++){
              
              
              tar_str =  Character.toString(b.charAt(i)).concat(Character.toString(b.charAt(i + 1)));
              
              
              String mat_str = Character.toString(a.charAt(i)).concat(Character.toString(a.charAt(i + 1)));
              
              
              if(mat_str.equals(tar_str)){
                count += 1;
              }
            }
            return count;
          }
          else if(n1 < n2){
            String tar_str = "";
            for(int i = 0; i < n1 - 1; i++){
              
              tar_str = Character.toString(a.charAt(i)).concat(Character.toString(a.charAt(i + 1)));
              
              String mat_str = Character.toString(b.charAt(i)).concat(Character.toString(b.charAt(i + 1)));
              
              if(mat_str.equals(tar_str)){
                count += 1;
              }
            }
            return count; 
          }
          else{
            String tar_str = "";
            
            for (int i = 0; i < n1 - 1; i++){
              
              tar_str = Character.toString(a.charAt(i)).concat(Character.toString(a.charAt(i + 1)));
              
              String mat_str = Character.toString(b.charAt(i)).concat(Character.toString(b.charAt(i + 1)));
              
              if(mat_str.equals(tar_str)){
                count += 1;
              }
              
            }
            
            return count;
          }
          
        }
        return count;
    }

    public static void main(String[] arguments){

        System.out.println(stringMatch("xxcaazz", "xxbaaz") );
        System.out.println(stringMatch("abc", "abc") );
        System.out.println(stringMatch("abc", "axc") );
        
    }
}
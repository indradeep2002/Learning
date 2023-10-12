package CodingBatJava.warmup_2;

public class string_yak {
    

    public static String stringYak(String str) {
        while(str.contains("yak")){
          str = str.replace("yak", "...");
        }
        
        String new_str = "";
        for(int i = 0; i < str.length(); i++){
          if(str.charAt(i) != '.'){
            new_str += str.charAt(i);
          }
        }
        
        return new_str;
    }

    public static void main(String[] arguments){

        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya") );
    }
}

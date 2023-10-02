package CodingBatJava.warmup_1;

public class string_E {
    public static boolean stringE(String str) {
        int eCounter = 0;
        for(int i = 0; i < str.length(); i++){
          char c = str.charAt(i);
          if(c == 'e'){
            eCounter += 1;
          }
        }
        if (eCounter > 0 && eCounter <= 3){
          return true;
        }
        return false;
    }

    public static void main(String[] arguments){
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
    }
}

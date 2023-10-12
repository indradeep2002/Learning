package CodingBatJava.warmup_2;

public class alt_paris {
    

    public static String altPairs(String str) {
        boolean one = true;
        boolean three = false;
        String n1 = "";
        int n = str.length();
        
        int i = 0;
        
        while (i < n){
          n1 += str.charAt(i);
          
          if(one == true){
            i += 1;
            one = false;
            three = true;
          }
          else if(three == true){
            i += 3;
            one = true;
            three = false;
          }
        }
        
        return n1;
    }

    public static void main(String[] arguments){

        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }
}

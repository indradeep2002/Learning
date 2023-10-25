public class middle_two {
    
    public static String middleTwo(String str) {
        int n = str.length();
        
        if(n < 1){
          return str;
        }
        
        int mid = n / 2;
        
        return ""+str.charAt(mid-1)+str.charAt(mid);
    }

    public static void main(String[] arguments){

        System.out.println(middleTwo("String"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("practice"));
    }
}

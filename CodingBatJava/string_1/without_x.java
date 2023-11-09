public class without_x {
    
    public static String withoutX(String str) {
        int n = str.length();
        
        if(n <= 1){
          
          return "";
        }
        
        char f1 = str.charAt(0);
        char f2 = str.charAt(n-1);
        
        
        if(f1 == 'x' && f2 == 'x'){
          return str.substring(1, n-1);
        }
        else if(f1 == 'x' && f2 != 'x'){
          return str.substring(1,n);
        }
        else if(f1 != 'x' && f2 == 'x'){
          return str.substring(0, n-1);
        }
        else{
          return str;
        }
    }

    public static void main(String[] arguments){

        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hix"));
    }
}

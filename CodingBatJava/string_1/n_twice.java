public class n_twice {
    
    public static String nTwice(String str, int n) {
        int k = str.length();
        
        if(k < 1){
          return "";
        }
        
        String ans = "";
        
        for(int i = 0; i < n; i++){
          ans += str.charAt(i);
        }
        
        for (int j = k - n; j < k; j++ ){
          ans += str.charAt(j);
        }
        
        return ans;
    }

    public static void main(String[] arguments){

        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));
    }
}

package CodingBatJava.warmup_2;

public class last_2{

    public static int last2(String str) {
        int count = 0;
        int n = str.length();
        String tar_str = "";
        
        
        if(n <= 1){
          return count;
        }
        
        for(int i = n - 2; i < n ; i++){
          tar_str += str.charAt(i);
        }
        
        
        for(int j = 0; j < n - 2; j++){
          String curr_str = "";
          
          curr_str += str.charAt(j);
          curr_str += str.charAt(j + 1);
          
          if(curr_str.equals(tar_str)){
            count += 1;
          }
        }
        
        return count;
    }


    public static void main(String[] arguments){

        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
    }
}
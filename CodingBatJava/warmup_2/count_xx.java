package CodingBatJava.warmup_2;

public class count_xx {
    public static int countXX(String str) {
        int count = 0;
        
        for(int i = 0; i < str.length(); i++){
          char c = str.charAt(i);
         
          if(c == 'x'){
            count += 1;
          }
          else if(c == ' '){
            count -= 1;
          }
        }
        
        if (count > 0){
          return count -1;
        }
        else if(count < 0){
          return 0;
        }
        return count;
    }

    public static void main(String[] arguments){
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }
}

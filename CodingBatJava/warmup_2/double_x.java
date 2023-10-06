package CodingBatJava.warmup_2;

public class double_x {
    public static boolean doubleX(String str) {
        for(int i = 0; i < str.length(); i++){
          char c = str.charAt(i);
          if(c == 'x' && i != str.length() - 1){
            char b = str.charAt(i+1);
            if(b == 'x'){
              return true;
            }
            return false;
          }
        }
        return false;
    }

    public static void main(String[] arguments){
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));

    }
}

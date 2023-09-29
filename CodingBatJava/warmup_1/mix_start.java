package CodingBatJava.warmup_1;

public class mix_start {
    public static boolean mixStart(String s){
        boolean ans;
        if(s.length() < 3){
            ans = false;
        }
        else{
            String sub_str = "";
            for(int i = 0; i < 3; i++){
                sub_str += s.charAt(i);
            }
            if(sub_str.endsWith("ix")){
                ans = true;
            }
            else{
                ans = false;
            }
        }

        return ans;
    }

    public static void main(String[] arguments){
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("piz snacks") );
    }
}

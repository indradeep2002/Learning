package CodingBatJava.warmup_1;

public class start_oz {
    
    public static String startOz(String str){
        String ans = "";
        if(str.equals("zzzz")){
            return "z";
        }


        
        if(str.startsWith("z")){
            return ans;
        }


        if(str.length() < 2){
            if(str.startsWith("o")){
                return "o";
            }
            else{
                return "";
            }
        }
        else{
            for(int i = 0; i < str.length(); i++){
                if(str.startsWith("oz")){
                    ans += "oz";
                    break;
                }
                else{
                    String local = "";
                    for(int j = 0; j < 2; j++){
                        local += str.charAt(i);
                    }
                    if(local.startsWith("o")){
                        ans += "o";
                        break;
                    }
                    else if(local.endsWith("z")){
                        ans += "z";
                        break;
                    }
                }
                
            }
        }

        return ans;
    }


    public static void main(String[] arguments){
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
    }
}

package CodingBatJava.warmup_1;

public class del_Del {
    public static String delDel(String str) {
        if(str.contains("del")){
          int index = str.indexOf("del");
          String new_string = "";
          for(int i = 0; i < str.length(); i++){
            if (i == index && index == 1){
              continue;
            }
            else if(i == index + 1 && index == 1){
              continue;
            }
            else if(i == index + 2 && index == 1){
              continue;
            }
            else{
              new_string += str.charAt(i);
            }
          }
          return new_string;
        }
        return str;
    }

    public static void main(String[] arguments){
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
    }
}

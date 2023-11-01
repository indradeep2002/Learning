public class see_color {
    
    public static String seeColor(String str) {
        if (str.startsWith("red")){
          return "red";
        } 
        else if(str.startsWith("blue")){
          return "blue";
        }
        return "";
    }

    public static void main(String[] arguments){

        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("bluexx"));
    }
}

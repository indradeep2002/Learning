public class has_bad {
    public static boolean hasBad(String str) {
        if(str.indexOf("bad") == 0 || str.indexOf("bad") == 1){
          return true;
        } 
        return false;
    }

    public static void main(String[] arguments){

        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxxx"));
        System.out.println(hasBad("xxbadxx"));
    }
}

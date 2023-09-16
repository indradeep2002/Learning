package CodingBatJava.warmup_1;

public class not_string {
    public static String notString(String str){
        if (str.startsWith("not") == false){
            return "not " + str;
        }
        return str;
    }

    public static void main(String[] arguments){
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
    }
}

package CodingBatJava.string_1;

public class make_tags {
    public static String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }

    public static void main(String[] arguments){
        System.out.println(makeTags("i", "yay"));
        System.out.println(makeTags("i", "hello"));
        System.out.println(makeTags("cite", "yay"));
    }
      
}

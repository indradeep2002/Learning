package CodingBatJava.string_1;

public class make_out_word {
    public static String makeOutWord(String out, String word) {
        String new_Ans = "";
        new_Ans += out.charAt(0);
        new_Ans += out.charAt(1);
        new_Ans += word;
        new_Ans += out.charAt(2);
        new_Ans += out.charAt(3);
        return new_Ans;
    }

    public static void main(String[] arguments){
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "Woohoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }
}



public class make_abba {
    public static String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    public static void main(String[] arguments){
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "up"));
    }
}

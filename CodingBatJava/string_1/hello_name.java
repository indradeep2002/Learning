package CodingBatJava.string_1;

public class hello_name {
    public static String helloName(String name) {
        return "Hello "+name + "!";
    }

    public static void main(String[] arguments){
        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
    }
}

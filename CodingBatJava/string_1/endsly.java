public class endsly {
    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }
    
    public static void main(String[] arguments){

        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }
}

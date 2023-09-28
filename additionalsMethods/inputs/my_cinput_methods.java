package additionalsMethods.inputs;

public class my_cinput_methods {
    

    public static String input(String arg){
        System.out.print(arg);
        String text = System.console().readLine();
        return text;
    }

    public static void main(String[] arguments){
        // Test 1: Using Sentenses 
        /*
         * String text = input("Enter Text: ");
         * System.out.println(text);
         */

        // Text 2: Using Int's
        /*
         * String text_int = input("Enter Text: ");
         * int text_as_int = Integer.parseInt(text_int);
         * System.out.println(text_as_int + 3);
         */

        // Text 2: Using Double's 
        /*
         * String text_double = input("Enter Double: ");
         * double text_as_double = Double.parseDouble(text_double);
         * System.out.println (text_as_double + 3.17);
         */   
        
    }


}

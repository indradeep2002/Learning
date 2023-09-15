package CodingBatJava.warmup_1;

public class parrotTrouble {
    public static boolean parrot_trouble(boolean talking, int hour){
        if ((talking == true) && (((hour >= 0 && hour < 7)) || ( (hour > 20 && hour <= 23)))){
            return true;
        }
        return false;
    }


    public static void main(String[] arguments){
        System.out.println(parrot_trouble(true, 6));
        System.out.println(parrot_trouble(true, 7));
        System.out.println(parrot_trouble(false, 6));
    }
}

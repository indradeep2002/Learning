package CodingBatJava.warmup_1;

public class monkey_trouble {
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        if ((aSmile == true) && (bSmile == true)){
            return true;
        }
        else if((aSmile == false) && (bSmile == false)){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] arguments){
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));
    }
}

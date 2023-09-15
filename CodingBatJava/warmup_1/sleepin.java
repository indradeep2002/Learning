package CodingBatJava.warmup_1;

public class sleepin {
    public static boolean sleepin_solution(boolean weekday, boolean vacation){
        if ((weekday == false) && (vacation == false)){
            return true;
        }
        else if((weekday == false) && (vacation == true)){
            return true;
        }
        else if((weekday == true) && (vacation == true)){
            return true;
        }
        else{
            return false;
        }
    }



    public static void main(String[] arguments){

        System.out.println(sleepin_solution(false, false));
        System.out.println(sleepin_solution(true, false));
        System.out.println(sleepin_solution(false, true));
    }
}

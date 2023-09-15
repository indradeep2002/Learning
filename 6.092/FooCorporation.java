public class FooCorporation {
    public static void Calculate(double base_pay, int hours_worked){
        if ((hours_worked <= 60) && (base_pay >= 8)){
            if (hours_worked > 40){
                int extra_time = hours_worked - 40;
                System.out.println((40 * base_pay) + (base_pay * 1.5 * extra_time));
            }
            else{
                System.out.println(hours_worked * base_pay);
            }
        }
        else{
            System.out.println("Error");
        }
    }

    public static void main(String[] arguments){
        Calculate(7.50, 35);
        Calculate(8.20, 47);
        Calculate(10.00, 73);
    }
}

public class Marathon {


    public static void fastest_runner(String[] names, int[] times){
        int min_val = times[0];
        int position = -1;

        for (int i = 0; i < times.length; i++){
            if (min_val > times[i]){
                min_val = times[i];
                position = i;
            }
        }

        for (int j = 0; j < names.length; j++){
            if (position == j){
                System.out.println(names[j] + ": " + times[j]);
            }
        }


    }

    public static void secound_fastest_runner(String[] names, int[] times){
        int[] copy = new int[times.length];

        for (int i = 0; i < times.length; i++){
            copy[i] = times[i];
        }

        for(int j = 0; j < copy.length; j++){
            for (int k = 1; k < copy.length - j; k++){
                if(copy[k-1] > copy[k]){
                    int temp = copy[k-1];
                    copy[k-1] = copy[k];
                    copy[k] = temp;
                }
            }
        }

        int val = copy[1];
        for (int l = 0; l < names.length; l++){
            if (times[l] == val){
                System.out.println(names[l] + ": " + val);
            }
        }
    }
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        
        fastest_runner(names, times);
        System.out.println("");
        secound_fastest_runner(names, times);

    }
}

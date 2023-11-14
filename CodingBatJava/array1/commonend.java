public class commonend {
    
    public static boolean commonEnd(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        
        if(n1 < 1 || n2 < 1){
          
          return false;
        }
        else if(a[n1 - 1] == b[n2 - 1]){
            return true;
        }
        else if(a[0] == b[0]){
          return true;
        }
        else{
          return false;
        }
          
    }

    public static void main(String[] arguments){

        int a[] = {1, 2, 3};
        int b[] = {7, 3};

        System.out.println(commonEnd(a, b));

        int c[] = {1,2,3};
        int d[] = {7, 3, 2};

        System.out.println(commonEnd(c, d));

        int e[] = {1, 2, 3};
        int f[] = {1, 3};

        System.out.println(commonEnd(e, f));
    }
}

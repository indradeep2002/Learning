class Baby{
    // fields 
    // can be accesed using a . ex-> classname.fieldname
    
    static String name;
    boolean isMale;
    double weight;
    double decibles;
    int numPoops = 0;
    Baby[] siblings;
    static int numBabiesMade = 0; 
    
    // constructor;
    Baby(String myName, boolean ismaleBaby){
        name = myName;
        isMale = ismaleBaby;
    }
    
    // this are methods 
    // can be accesed using a . ex-> classname.methodsName[args...]
    
    static void sayHi(){
        System.out.println("Hi! my name is "+name);
    }
    
    void poop(){
        numPoops += 1;
        System.out.println("Dear Mother i have pooped!");
    }
    boolean ismale(){
        if (isMale == true){
            return true;
        }
        return false;
    }
    static int numbaby(){
        return numBabiesMade;
    }
}


public class lecture4Codes {
    public static void main(String[] args) {
        Baby myBaby = new Baby("Indradeep" , true);
        myBaby.sayHi();
        myBaby.poop();
        System.out.println(myBaby.ismale());
        myBaby.name = "Subhadeep";
        myBaby.sayHi();
        
        Baby my2Baby = new Baby("raj" , true);
        my2Baby.sayHi();
        Baby.numBabiesMade = 100;
        Baby b1 = new Baby("rajesh",true);
        Baby b2 = new Baby("raju", true);
        //Baby.numBabiesMade = 2; 
        System.out.println(Baby.numbaby());
     } 
}

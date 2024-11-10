
public class Main{
    public static void main(String args[]){
           
        //Generics == enable types (classes and interfaces) to be parameters when defining :
        //            classes,interfaces and methods
        //            a benefit is to eliminate the need to create multiple versions
        //            of methods or classes for various data types.
        //            use  1 version for all refrence dtata types.

        Integer[] intArray = {1,2,3,4,5,6};
        Double [] doubleArray = {5.5,4.4,3.3,2.2,1.1};
        Character [] charArray = {'H','E','L','L','O'};
        String[] stringArray = {"B","Y","E"};

     //displayArray(intArray);
     //displayArray(doubleArray);
     //displayArray(charArray);
    //displayArray(stringArray);

    System.out.println(getFirst(intArray));
    
    System.out.println(getFirst(doubleArray));
    
    System.out.println(getFirst(charArray));
    
    System.out.println(getFirst(stringArray));
     
     }
     //initalize generic
     public static<Thing> void displayArray(Thing [] array){
            
        for (Thing x : array) {
                    
            System.out.println(x + " ");
            
        }
}

     // getting first element using thing
     public static <Thing> Thing getFirst(Thing [] array){
        return array[0];
     }
//invidual
public static void displayArray(Double  [] array){
            
    for (Double x : array) {
                
        System.out.println(x + " ");
        
    }
}
public static void displayArray(Character [] array){
            
    for (Character x : array) {
                
        System.out.println(x + " ");
        
    }
}
public static void displayArray(String [] array){
            
    for (String x : array) {
                
        System.out.println(x + " ");
        
    }
}
}
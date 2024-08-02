//Methods
//like function we can call anytime and not the main and 
//Small case only start

public class Sample{
    public static void main(String [] args){

        String name = "Bro";
        hello(name);
    }

    //create a new methods
    static void hello(String name){
        System.out.println("Hello"+" " + " " +name);
    }
}
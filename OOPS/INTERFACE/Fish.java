//to interface we can use like
public class Fish implements  Prey,Predator{
    
    @Override
    public void flee(){
       System.err.println("This fish is flee from larger fish...");
    }

    @Override
    public void hunt(){
        System.out.println("This fish is hunting an smaller fish...");
    }
}

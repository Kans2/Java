//ArrayList ----> resizebale array. 
//              Elements can add or remove 
//               store refrence data types
import java.util.*;
public class  Sample{
    public static void main(String[] args) {
        
    
    ArrayList<String> food = new ArrayList <String>();
    
    food.add("pizza");
    food.add("Chikken");
    food.add("rice");
    food.add("niku");
    
    
    //SET method
    
    food.set(0,"sushi");
    food.remove(2);
    
   
    
    for(int i=0; i< food.size(); i++){
       System.out.println(food.get(i));
    }
    System.out.println("*********************");
    

    //get the String index methid
    System.out.println(food.indexOf("niku"));
    

    }
    
    
    

}



public class Hero extends Person {

    String power;

     Hero(String name,String power,
     Boolean heart,
     String Special,
     Boolean Death) {
         
       
         super(name, heart, Special, Death);   //call the method in super class use super key word
         this.power = power;

    }

    

    
}

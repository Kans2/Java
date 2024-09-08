

public class Main {
    public static void main(String[] args) {
        //Polymorphism = greek word for poly "many",morph "form"
        //               the ability of an object to identify as more than one type..
        //        many objects single arraykula place.... //Common 
    Car car = new Car();
    Bicycle cycle = new Bicycle();
    Boat boat = new Boat();

   Vehicle[]  racers = {car,cycle,boat};
 
     for(Vehicle x : racers){
         x.go();
     }
        
    }
}

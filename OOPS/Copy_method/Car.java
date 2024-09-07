

public class Car {
    String name;
    String color;

    Car(String name, String color){
        this.name = name;
        this.color = color;
      }

      public void copy(Car x){
        this.name = x.name;
        this.color = x.color;

      }
    
}

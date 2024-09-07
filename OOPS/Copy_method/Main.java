

public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car("Honda","black");
        Car car2 = new Car("Ferrari","white");

        car2.copy(car1);

      System.out.println(car1);
      System.out.println(car2);
       

    }
}

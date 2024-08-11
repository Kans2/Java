public class  Main{

    public static void main(String[] args) {

        Car car = new Car();
        Cycle cycle = new Cycle();

        car.go();
        System.out.println(car.name);
        cycle.go();
    }
}

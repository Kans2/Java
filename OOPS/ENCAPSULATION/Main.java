public class Main {
    public static void main(String[] args) {
        //Encapsulation = attributes of a class will be hidden or private,
        //                can be accesed only through methods(getters & Setters)
        //                 you should make Attributes private if you dont have a reason to make them public/privated.
        
        Car car = new Car("Supra","Japanese","white","new",2070);


        car.setName("Lamborgini");
        System.out.println(car.getName() );

    }
}

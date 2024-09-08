
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //polymorphism  = many shapes/forms
        //dynamic = after compilation(during time)

        //ex:supra is a : supra , and a car, ana an vehicle , and object
        Scanner sc = new Scanner(System.in);
        Animal animal;   //anithaing we want to declare  object

        System.out.println("What animal do you want bro?");
        System.out.println("(1 for dog)-(2 for cat)");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                animal = new Dog();
                animal.speak();
                break;
            case 2:
                animal = new Cat();
                animal.speak();
                break;
            default:
                System.out.println("Enter the valid number..");
                animal = new Animal();
                animal.speak();
        }

     }
  
}

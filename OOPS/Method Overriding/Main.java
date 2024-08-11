public class Main {
    //Method overriding = Declare a method in sub class
    //                    which is already present in parent class
    //                    done so that a child class can give its own implementation
    //                    own methods and inherit from the parebt class
    public static void main(String[] args) {
        
      Animal animal = new Animal();
      Dog dog = new Dog();

      animal.speak();
      dog.speak();

    }
}

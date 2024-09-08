public class Main {
    public static void main(String[] args) {
        //Interface =  a template that can be applied to a class
        //             similar to inheritance, but specifies what a class has/must do.
        //             classes can apply more than one interface, inheritance is limit to 1 super

        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Snake snake = new Snake();
        snake.hunt();
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}

public class Construct{
    //Special Method that called when object is initialized (created)
    public static void main(String[] args){

        Human human1 = new Human("Jhon","male",20,true);
        Human human2 = new Human("Joe","male",18, true);

        System.out.println(human1.name);
         System.out.println(human2.name);
    }
}
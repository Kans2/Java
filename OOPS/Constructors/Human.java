public class Human{
      
      String name ;
      String Gender ;
      int age ;
      Boolean isAlive ;
      //Syntax
      Human(String name ,
      String Gender ,
      int age ,
      Boolean isAlive ){

     this.name = name;
     this.Gender = Gender;
     this.age = age;
     this.isAlive = isAlive;

      }  //constructor



    //Methods
    void eat(){
      System.out.println(this.name + " " + " " + " is eating");
    }

}
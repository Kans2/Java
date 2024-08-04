public class ArrOf { 

    public static void main (String [] args){
            
            //food array for Food class
          //  Food [] Refridgerator = new Food [4];

            Food food1 = new Food("Pizza");
              Food food2 = new Food("Hottog");
                Food food3 = new Food("Desert");
                  Food food4 = new Food("Pepsi");

        Food[] Refridgerator ={food1};


       //  Refridgerator[0]= food1;
       //  Refridgerator[1]= food2;
       //  Refridgerator[2]= food3;
        // Refridgerator[3] = food4;


         System.out.println(Refridgerator[0].name);
            


       
    }

}
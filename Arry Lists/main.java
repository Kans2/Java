//ArrayList ----> resizebale array. 
//              Elements can add or remove 
//               store refrence data types

import java.util.*;

ArrayList<String> food = new ArrayList<String>();

food.add("pizza");
food.add("Chikken");
food.add("rice");


//SET method

food.set(0,"sushi");
food.remove(2);



for(int i=0; i< food.size(); i++){
    print(food.get(i));
}

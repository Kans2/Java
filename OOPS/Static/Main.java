public class Main{
     
    public static void main(String[] args){
        
        Friend friend = new Friend("jhon", 3, true);
        Friend friend2 = new Friend("Spongboob", 5, true);

        
        //static method takes a full class 
        System.out.println(Friend.numberOfFriends);
        Friend.Total();
        
    }

}
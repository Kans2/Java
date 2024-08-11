public class Friend{

    String name;
    int Year;
    Boolean isAlive;
    //INITIALIZE THE STATIC MPODIFIER
    static  int numberOfFriends;                 //var

    Friend(String name ,int Year, Boolean isAlive){
      
      this.name = name;
      this.Year= Year;
      this.isAlive=isAlive;
      numberOfFriends++;
    }


    //methods 
     void fun(){
         System.out.println("they are making fun ..."+ Friend.this.name);
    }

    void help(){
       System.out.println("they are making help buddy..."+ Friend.this.name);
    }

    public static void Total (){                            //static use own class no need to put like instances 
                                                            //  Directly access the class

        System.out.println(Friend.numberOfFriends);
    }
}
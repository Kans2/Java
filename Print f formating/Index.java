public class Index{

       //width [string ]
       //precision [floating point]
       //Flags  [-,+,0,,]


    public static void main (String [] args){
        System.out.printf(" %d number is ",4000);   //% modifyier where ever we want num
        System.out.printf(" %b number is ",4000);  //boolean modifier
        System.out.printf(" %s number is ",4000);   //string 
        System.out.printf(" %c number is ",4000);   //character
        System.out.printf(" %f number is ",4000);   //float (or) double

        //width
         System.out.printf("  number is %10s ",String);  
        //precision
         System.out.printf("  number is %.2f ",float);
        //Flags
         System.out.printf("  you have this money %+f ",float);    
          System.out.printf("  you have this money %,f ",float);  
    }
}
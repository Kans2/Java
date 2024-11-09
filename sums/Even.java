public class Even{
    public static void main(String[]args){
           System.out.println(even(4));
    }

    public static int even(int n){

        if(n % 2 == 0 ){
           return 2;
        }else{
           return 1;
        }
    }
}

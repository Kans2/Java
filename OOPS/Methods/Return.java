public class Return{
    public static void main(String[] args ){
        int x = 5 ;
        int y = 2045;
        int z = add(x,y);

        System.out.println(z);
    }

    static int add(int x, int y){
           
           int result = x + y;

           return result;
    }
}
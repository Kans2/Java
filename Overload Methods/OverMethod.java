//overload = same name Diffrent Parameters
            //method name = parameters * signature

public class OverMethod{
    public static void main(String [] args){

        System.out.println(add(10,10,10,10));
    }


    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
         return a + b + c;
    }
    static int add(int a, int b, int c,int d){
        return a + b + c + d;
    }
}
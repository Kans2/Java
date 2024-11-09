public class EvenCount {
    public static void main(String[] args) {
        System.out.println(even(2, 4, 6, 8, 10));
    }
    
    public static  int even(int num1,int num2,int num3, int num4, int num5){
        int count = 0;
            
        if(num1 % 2==0 && num2 % 2 == 0 || num3 % 2 == 0 || num4 % 2 == 0 || num5 % 2 == 0){
            count++;
        } //line by line statements
        return  count;
    }
}

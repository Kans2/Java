public class LastTwo{
    public static void main(String[] args) {
        System.out.println(add(23,55));
    }
    public static int add(int num1,int mum2){
        int digit = num1 % 10;
        int First = digit;
        int Second = mum2 % 10;
        int third = Second;
        return First + third;

    }

}
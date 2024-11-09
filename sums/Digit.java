public class Digit {
    public static void main(String[] args) {
        System.out.println(digit(-33));
    }
    public static int digit(int num){
        
            int digit = num % 10;
            if(digit < 0){
                digit *= -1;
            }

            return  digit;

    }
}

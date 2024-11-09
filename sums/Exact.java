public class Exact {
    public static void main(String[] args) {
        
    System.out.println(Mul(4, 3));
    }
    public  static int Mul(int n, int m){
        if(n % m == 0){
            return 2;
        }else if(n == 0 || m == 0){
            return 3;
        }else{
            return 1;
        }

    }
}

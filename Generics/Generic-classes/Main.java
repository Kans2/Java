public class Main {
    public static void main(String[] args) {
     
        MyGenericClass <Integer,Integer> myint = new MyGenericClass<>(1,5);
        MyGenericClass <String> mystr = new MyGenericClass<>("hello");
        MyGenericClass <Character> mychar = new MyGenericClass<>('I');
        MyGenericClass <Double> mydouble = new MyGenericClass<>(1.1);


        System.out.println(myint.getValue());
        System.out.println(mystr.getValue());
        System.out.println(mychar.getValue());
        System.out.println(mydouble.getValue());
        
        
        

    }
}



import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exceptions = an event that occurs during the execution of a programe that,
        //             distrubs the normal flow of instructions
        Scanner sc = new Scanner(System.in);
        try {
           
            System.out.println("enter the number1 numbers:  ");
            int number1 = sc.nextInt();
            System.out.println("Enter a second number:");
            int number2 = sc.nextInt();
            
            int total = number1/number2;
    
            System.out.println("the divide number is:"+total);
            
        } catch (ArithmeticException e) {
            System.out.println("you cant divide by Zero!");
        }
        catch(InputMismatchException e){
            System.out.println("please enter a number..");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("this will always run");
            sc.close();
        }
        }
    }

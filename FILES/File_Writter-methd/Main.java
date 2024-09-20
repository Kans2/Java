import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
    

     try {
        FileWriter writter = new FileWriter("Message.txt");
        writter.write("Hardest choices\n Require Strongest wills");
        writter.append("\n(A quit by kans)");
        writter.close();
         
     } catch (IOException e) {
        e.printStackTrace();
     } 


    }
}

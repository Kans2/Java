
import java.io.FileReader;



public class Main {
    public static void main(String[] args) {
        //fileReader = read the contents of file as stream of characters. One by one
        //             read() returns an int value which contains the byte value
        //             when read() return -1, there is no more data to be read
      try {
          FileReader reader = new FileReader("suer.txt");
          int data = reader.read();
          while (data != -1) {
         
            System.out.print((char) data);
            data = reader.read();

              
          }
          reader.close();

      } catch (Exception e) {
      }

        
    }
}

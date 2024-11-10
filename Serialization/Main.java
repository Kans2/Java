import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //                       Steps to Serialize
        //                       -----------------------------------
        //                       1. your object class should implement Serializble interface
        //                       2. add import java.io.Serializable;
        //                       3.FileOutputStream fileOut = new FileOutPutStream(file path);
        //                       4.ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //                       5.out.WriteObject(objectName)
        //                       6.out.close(); fileOut.close();

        User user = new User();

        user.name = "Bro";
        user.password = "I >3 pizza";
     
        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object info saved :)");

    }
}

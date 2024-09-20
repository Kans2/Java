package FILES.File_Class;
import java.io.File;

public class Main{
    public static void main(String[] args) {
        //file = An abstract representation of file and directory pathnames
     // File file = new File("secret-key.txt");
      File file = new File("secret-key.txt");
      if(file.exists()){
        System.out.println("the file is exists :O");
        //geting the file location
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isFile() );
       // file.delete();  


      }else{
        System.out.println("the file doesnt exixts");
      }

        

    }

}
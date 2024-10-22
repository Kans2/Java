import javax.swing.JOptionPane;

public class Main{
    public static void main(String [] args){

        String name = JOptionPane.showInputDialog("Enter your name");

        JOptionPane.showMessageDialog(null,"hello",+name);

        int age =Integer.parseInt( JOptionPane.showInputDialog("Enter ur Age:"));

        JOptionPane.showMessageDialog(null,"You are" + age + "yera old");


    }
}
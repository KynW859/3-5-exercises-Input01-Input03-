import javax.swing.*;
public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String stringPut = JOptionPane.showInputDialog("type a cool number");
        //.out.println(stringPut);

        //Parse the input as an int.
        //Print its value +1
        int funnyInput = Integer.parseInt(stringPut);
        ++funnyInput;
        System.out.println(funnyInput);

        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int challengeMode = Integer.parseInt(JOptionPane.showInputDialog("type another number")) +1;
        System.out.println(challengeMode + "\n" + "wow you did it");
        
    }
}

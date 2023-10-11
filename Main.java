import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        //Create a new User object
        User user = new User();

        //User name and password
        user.name = "Kevin";
        user.password = "HardPassword";

        //Create an output stream to write the user Object to a file
        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser"); //Project folder
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        //Writes the User object to the file
        out.writeObject(user);

        //Close the output stream and file stream
        out.close();
        fileOut.close();

        //Prints a message to indicate that the object info has been saved
        System.out.println("Object info saved!");
    }
}

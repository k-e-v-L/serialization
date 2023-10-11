import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Initialize a User object as null
        User user = null;

        //Create an input stream to read a serialized object from a file
        FileInputStream fileIn = new FileInputStream("C:\\Users\\strdu\\IdeaProjects\\serialization\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);

        //Read the serialized User object from the file and cast it to User type
        user = (User) in.readObject();

        //Close the input stream and file stream
        in.close();
        fileIn.close();

        //Print the user's name and password
        System.out.println(user.name);
        System.out.println(user.password);

        //Call the sayHello method of the User object
        user.sayHello();
    }
}

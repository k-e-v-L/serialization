import java.io.Serializable;

public class User implements Serializable {

    //Define instance variables
    String name; //user's name
    transient String password; //User's password is marked as transient to exclude it from serialization

    //Define a method to print a greeting
    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
import java.io.Serializable;

public class User2 implements Serializable {

    //Define instance variables
    String name; //User's name
    transient String password; ////User's password is marked as transient to exclude it from serialization

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
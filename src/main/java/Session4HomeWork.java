import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

public class Session4HomeWork {
    public static void main(String[] args) {
        String username = "my.home.mail@gmail.com";
//          System.out.print("Чи це Gmail? → " + username.endsWith("@gmail.com"));
            System.out.println("indexOf('@'): " + username.indexOf('@'));
            System.out.println(username.lastIndexOf('@'));

        }
    }
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

public class Session4HomeWork {
    public static void main(String[] args) {
        String username = "my.home.mail@gmail.com";
//          System.out.print("Чи це Gmail? → " + username.endsWith("@gmail.com"));
            System.out.println("indexOf('@'): " + username.indexOf('@'));
            System.out.println(username.lastIndexOf('@'));
        for (int i = 0; i < username.toCharArray().length; i++) {
            if (username.charAt(i) == '@') {
                System.out.println("\"@\" found at: " + i);

                String namePart = username.substring(0, 12);
                String domainPart = username.substring(12);
                System.out.println("Частина 1: " + namePart);
                System.out.println("Частина 2: " + domainPart);

                String repeat = "my.home.email";
                System.out.print(repeat.replace(".", "_"));
            }
        }


        }
    }
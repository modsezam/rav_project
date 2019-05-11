package pl.sda.rav;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("Pavlosik",UserType.CUSTOMER,"moje-hasło" );
        System.out.println(user.toString());

        List<User> users = new ArrayList<>(10);






    }
}

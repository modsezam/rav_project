package pl.sda.rav;

public class Main {
    public static void main(String[] args) {
        User user = new User("Paweł", "Kowal","Pavlosik");
        user.changePassword("tomojehasło");
        System.out.println(user.toString());





    }
}

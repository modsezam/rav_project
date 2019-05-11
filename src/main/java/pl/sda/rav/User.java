package pl.sda.rav;

public class User {
    private String name;
    private String lastName;
    private String login;
    private String password;
    private int defaultPasswordLength = 10;

    public User(String name, String lastName, String login) {
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: " + this.password);
    }

    private String randomPassword(int length) {
        String passwordSet = "abcdefghijklmnoqprstuwxyzABCDEFGHIJKLMNOQPRSTUWXYZ!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    public void changePassword(String password){
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, last name: %s, login: %s, password: %s", name, lastName, login, password);
    }
}

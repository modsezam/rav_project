package pl.sda.rav;

import java.util.Comparator;

public class User implements Comparable<User>{
    private String login;
    private UserType userType;
    private String password;
    private int defaultPasswordLength = 10;

    public User(String login, UserType userType, String password) {

        this.login = login;
        this.userType = userType;
        this.password = password;
        //this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: " + this.password);
    }

//    private String randomPassword(int length) {
//        String passwordSet = "abcdefghijklmnoqprstuwxyzABCDEFGHIJKLMNOQPRSTUWXYZ!@#$%";
//        char[] password = new char[length];
//        for (int i = 0; i < length; i++) {
//            int rand = (int) (Math.random() * passwordSet.length());
//            password[i] = passwordSet.charAt(rand);
//        }
//        return new String(password);
//    }
//    public void changePassword(String password){
//        this.password = password;
//    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return String.format("Login: %s, user type: %s, password: %s", login, userType, password);
    }


    @Override
    public int compareTo(User o) {
        Comparator<User> userComparator = Comparator.comparing(User::getLogin);
        return userComparator.compare(this,o);
    }

    public void add(String s) {
    }
}


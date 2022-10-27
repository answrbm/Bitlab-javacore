package chapter1.task6;

public class Main {
    public static void logIn(String login, String password) {
        final String realLogin = "admin";
        final String realPassword = "123";
        if(realLogin.equals(login) && realPassword.equals(password)) System.out.println("Authentication completed");
        else System.out.println("Invalid login or password");
    }
}

public class Data extends Main {

    public static void printData(String login, String password, String confirmPassword) {

        if (login.length() <= 20 && login.length() >= 1 && login.matches("[a-zA-Z0-9_]+")) {
            System.out.println("true");
        } else throw new RuntimeException("WrongLoginException");

        if (password.length() <= 20 && password.length() >=1 && password.matches("[a-zA-Z0-9_]+")) {
            System.out.println("true");
        } else throw new RuntimeException("WrongPasswordException");

        if (confirmPassword.length() <= 20 && confirmPassword.length() >=1 && confirmPassword.matches("[a-zA-Z0-9_]+") &&
                confirmPassword.equals(password)) {
            System.out.println("true");
        } else throw new RuntimeException("WrongPasswordException");

    }

}

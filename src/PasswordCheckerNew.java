import java.util.Scanner;

public class PasswordCheckerNew {

    private static Boolean hasUpper(String pass) {
        for (char ch : pass.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    private static Boolean hasDigit(String pass) {
        for (char ch : pass.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    private static Boolean hasSymbol(String pass) {
        for (char ch : pass.toCharArray()) {
            if (!(Character.isLetterOrDigit(ch) || Character.isWhitespace(ch))) {
                return true;
            }
        }
        return false;
    }

    private static Boolean hasSpace(String pass) {
        if (pass.indexOf(' ') != -1){
            System.out.println("No Spaces Allowed!\n");
            return true;
        }
        return false;
    }

    private static void printMessage(String errorMessage) {
        if (errorMessage.isEmpty())
            System.out.println("Your password is STRONG!");
        else
            System.out.println(errorMessage);
    }

    private static String getPassword() {
        String password;
        boolean t = true;
        String errorMessage = "";
        Scanner s = new Scanner(System.in);
        do {
            do {
                do {

                    System.out.println("Enter A password (must be 8 character long with no space) : \n");
                    password = s.nextLine();

                    if (password.length() < 8) {
                        System.out.println("Enter the password for at least 8 character, please enter again!\n");
                    }
                } while (password.length() < 8);
            }
            while (hasSpace(password));


            errorMessage = "";
            errorMessage += hasUpper(password) ? "" : "Password does not have any Uppercase. \n";
            errorMessage += hasDigit(password) ? "" : "Password does not have any digit. \n";
            errorMessage += hasSymbol(password) ? "" : "Password does not have any symbol. \n ";
            printMessage(errorMessage);

            if (!errorMessage.isEmpty()) {
                t = false;
                System.out.println("Try for Strong Password or Save this one!");
                System.out.println("Enter 1 for the Strong password or 0 to save the entered password");
                int e = s.nextInt();
                if (e == 1) {
                    t = true;
                }


            }
            else {
                t= false;
            }

        }while(t);
//        } while (!errorMessage.isEmpty());
        return password;
    }

    public static void main(String[] args) {

        String password = getPassword();
        System.out.println("Your password is : " + password);

    }
}

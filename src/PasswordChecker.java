import java.util.Scanner;

public class PasswordChecker {
    static Boolean IsUpper(String pass) {
        for (char ch : pass.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    static Boolean IsDigit(String pass) {
        for (char ch : pass.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    static Boolean IsSymbol(String pass) {
        for (char ch : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                return true;
            }
        }
        return false;
    }


    static String IsUpper(String pass, String out) {
        for (char ch : pass.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                continue;
            }
        }
        return "upper";
    }

    static String IsDigit(String pass, String out) {
        for (char ch : pass.toCharArray()) {
            if (Character.isDigit(ch)) {
                continue;
            }
        }
        return "digit";
    }

    static String IsSymbol(String pass, String out) {
        for (char ch : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                continue;
            }
        }
        return "symbol";
    }

    static String EnterPass() {
        boolean c = false;
        String pass;
        do {
            do {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter A password (must be 8 character long with no space)");
                pass = s.nextLine();

                if (pass.length() < 8) {
                    System.out.println("Enter the password for at least 8 character");
                }
            } while (pass.length() < 8);
            for (char x : pass.toCharArray()) {
                if (Character.isWhitespace(x)) {
                    c = true;
                    break;
                }
            }
        }
        while (c);
        return pass;
    }

    public static void main(String[] args) {


        String pass;


//        System.out.println("Enter A password (must be 8 character long with no space)");

//        password = s.nextLine();
        pass = EnterPass();
        String out = " ";
        boolean p = IsUpper(pass);
        boolean y = IsDigit(pass);
        boolean z = IsSymbol(pass);

        out += IsUpper(pass, out);
        out += IsDigit(pass, out);
        out += IsSymbol(pass, out);

//        out += p ? "" : " Password does not have any Uppercase. ";
//        out += y ? "" : " Password does not have any digit ";
//        out += z ? "" : " Password does not have any symbol ";
        if (p && y && z) {
            System.out.println("Strong");
        } else if (p && y) {
            System.out.println("Password does not have any symbol");

        } else if (z && y) {
            System.out.println("Password does not have any Uppercase");
        } else if (p && z) {
            System.out.println("Password does not have any digit");
        } else {
            System.out.println("password is not strong");

            System.out.println("your password is saved");
        }

        System.out.println(pass);
        System.out.println("====================");
        System.out.println(out);
    }
}

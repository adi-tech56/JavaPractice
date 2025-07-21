import java.util.Scanner;

public class Overloading2 {

    static boolean Validate(String name){
        if (name == null || name.trim().isEmpty()) {
            return false; // Name cannot be null or empty
        }
        for (char ch : name.toCharArray()) {
            if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
                return false; // Disallow non-alphabetic characters and non-whitespace
            }
        }
        return true;
    }
    static boolean Validate (int age){
        if(age > 3 && age< 21){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
        System.out.println("Enter the  name & age");
        String name = s.nextLine();
        int age = s.nextInt();
        if(Validate(name)){
            System.out.println("Name is valid name");
        }
        else{
            System.out.println("Name is not a valid name");
        }
        if(Validate(age)){
            System.out.println("Age is a valid school going");
        }
      else{
            System.out.println("Age is a valid school going");
        }
    }
}

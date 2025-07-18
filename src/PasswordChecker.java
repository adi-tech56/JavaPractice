import java.util.Scanner;

public class PasswordChecker {
    static Boolean IsUpper(String pass){
        for(char ch : pass.toCharArray()){
            if(Character.isUpperCase(ch))
            {
                return true;
            }
        }
        return false;
    }
    static Boolean IsDigit(String pass){
        for(char ch : pass.toCharArray()){
            if(Character.isDigit(ch))
            {
                return true;
            }
        }
        return false;
    }
    static Boolean IsSymbol(String pass){
        for(char ch : pass.toCharArray()){
            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch))
            {
                return true;
            }
        }
        return false;
    }
  static String EnterPass(String pass){
      boolean c = false;
      do{
          do{
              Scanner s = new Scanner(System.in);
              System.out.println("Enter A password (must be 8 character long with no space)");
              pass = s.nextLine();

              if(pass.length() < 8 ){
                  System.out.println("Enter the password for at least 8 character");
              }
          }while(pass.length() < 8 );
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



        String password ="";
        String pass;


        Scanner s = new Scanner(System.in);
//        System.out.println("Enter A password (must be 8 character long with no space)");

//        password = s.nextLine();
        pass = EnterPass(password);

    boolean p = IsUpper(pass);
    boolean y = IsDigit(pass);
    boolean z = IsSymbol(pass);
    if (p && y && z){
        System.out.println("Strong");
    }
    else if(p && y){
        System.out.println("Password does not have any symbol");

    }
    else if(z && y){
        System.out.println("Password does not have any Uppercase");
    }
    else if(p && z){
        System.out.println("Password does not have any digit");
    }
else{
        System.out.println("password is not strong");

        System.out.println("your password is saved");
    }

        System.out.println(pass);

    }
}

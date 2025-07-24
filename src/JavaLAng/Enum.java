package JavaLAng;
enum Dept{
    CS,IT,CIVIL,ECE
}
public class Enum {
    public static void main(String[] args) {
        Dept d= Dept.CS;
        switch(d){
            case CS -> System.out.println("Head :John");
            case CIVIL -> System.out.println("Head:Ram");
            case ECE -> System.out.println("Head:Rahul");
            case IT -> System.out.println("Head :Rohit");
            default -> System.out.println("Not in enum");
        }
    }
}

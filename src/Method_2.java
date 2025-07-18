public class Method_2 {
//    static void update(int A[])
//    {
//        A[0] = 25;
//            System.out.println(A[0]);
//    }
//    pass by value and refrence
    static String userName(String email){
        int a = email.indexOf('@');
        String name = email.substring(0,a);
        return  name;
    }
    public static void main(String[] args) {
//        int A[] ={2,3,4,5,6};
//        update(A);
         String mail = "user@gmail.com";
        System.out.println(userName(mail));

// In Java the value is changed on object but not during the primitive data type passing
    }
}

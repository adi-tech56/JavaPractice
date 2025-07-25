import JavaLAng.Book;

import java.lang.reflect.Method;

public class Reflection_2 {
    public static void main(String[] args) {
                Class c = JavaLAng.Book.class;
        Method[] f = c.getDeclaredMethods();
        for(int i = 0 ; i< f.length;i++) {
            if(f[i].getReturnType() == void.class){
                System.out.println(f[i].getClass() + " " +f[i].getName() + " " + f[i].getReturnType());

            }
        };

    }
}

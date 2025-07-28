import JavaLAng.Book;

import java.lang.reflect.Method;

public class Reflection_2 {
    public static void main(String[] args) {
                Class c = NewSub1.class;
        System.out.println(c.getSuperclass());
             Class t = c.getSuperclass();


        Method[] f = c.getDeclaredMethods();
        for(int i = 0 ; i< f.length;i++) {
//            if(f[i].getReturnType() == void.class){
//                System.out.println(f[i].getClass() + " " +f[i].getName() + " " + f[i].getReturnType());
//
//            }
            try {
                Method superMethod = t.getMethod(f[i].getName(), f[i].getParameterTypes());

                if (superMethod != null && superMethod.getReturnType().isAssignableFrom(f[i].getReturnType())) {
                    // This indicates an override
                    System.out.println("Method is overriding a superclass method." + superMethod);
                }
            } catch (NoSuchMethodException e) {
                // No method with the same signature exists in the superclass, so it's not an override.
                System.out.println("Method is not overriding a superclass method.");
            }
        };

    }
}

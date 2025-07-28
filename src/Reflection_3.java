import java.io.File;
import java.lang.reflect.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Objects;

public class Reflection_3 {
    private static void method_void1(Method m,Class t){


        try {

            Method superMethod = t.getMethod(m.getName(), m.getParameterTypes());
            if (superMethod != null && superMethod.getReturnType().isAssignableFrom(m.getReturnType())) {
                // This indicates an override
                System.out.println(m + "   "+"Method is overriding a superclass method." + "  "+superMethod);
            }
            else {    System.out.println("Method is not overriding a superclass method." + superMethod);

            }
        } catch (NoSuchMethodException e) {
            // No method with the same signature exists in the superclass, so it's not an override.
System.out.println("Method is not overriding a superclass method." +e);
        }
    }
    static void class_type1(Class c, Class t){
        Method[] f = c.getDeclaredMethods();
        for(int i = 0 ; i< f.length;i++) {
            method_void1(f[i],t);
            Arrays.stream(f[i].getAnnotations()).findAny();
        };
    }
    private static void class_instance1(String name) throws ClassNotFoundException {
//        System.out.println(name);

        Class c = Class.forName(name);
        Class t = c.getSuperclass();
        class_type1(c,t);

    }
    public static void main(String[] args) throws Exception {
//
//        Class c = Book.class;
//        class_type(c);

        String packageName = "NewJava";
        String path = packageName.replace('.', '/');
        // Get a resource URL for that path
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL packageURL = classLoader.getResource(path);
        if (packageURL == null) {
            System.out.println("Package not found!");
            return;
        }
        File directory = new File(packageURL.toURI());
        if (!directory.exists()) {
            System.out.println("Directory not found!");
            return;
        }
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            String fileName = file.getName();
            if (fileName.endsWith(".class")) {

                String className = fileName.substring(0, fileName.length() - 6);
                String fullClassName = packageName + "." + className;

//                System.out.println(fullClassName);
                class_instance1(fullClassName);

//                Class<String> clazz = (Class<String>) Class.forName(fullClassName);

//                System.out.println( clazz);

            }
        }

    }
}

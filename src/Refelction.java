import JavaLAng.Book;

import java.io.File;
import java.lang.reflect.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Arrays;
import java.util.Objects;

public class Refelction {
    private static void method_void(Method m){
        if(m.getReturnType() == void.class){
            System.out.println(m.getClass() + " " +m.getName() + " " + m.getReturnType());

        }
    }
    static void class_type(Class c){
        Method[] f = c.getDeclaredMethods();
        for(int i = 0 ; i< f.length;i++) {
            method_void(f[i]);
        };
    }
    private static void class_instance(String name) throws ClassNotFoundException {
        System.out.println(name);

        Class c = Class.forName(name);
        class_type(c);

    }
    public static void main(String[] args) throws Exception {
//
//        Class c = Book.class;
//        class_type(c);

        String packageName = "java";
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
                class_instance(fullClassName);

//                Class<String> clazz = (Class<String>) Class.forName(fullClassName);

//                System.out.println( clazz);

            }
        }

    }
}

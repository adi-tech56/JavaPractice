package JavaLAng;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the class name (Book, Video, Podcast):");
        String className = scanner.nextLine();
        String className1 = "JavaLAng."+className;
        System.out.println("Enter the method name (e.g., displayInfo, play):");
        String methodName = scanner.nextLine();
        Book b = new Book();
        try {
            Class<?> clazz = Class.forName(className1);  // Dynamically load the class

            Object obj = clazz.newInstance();  // Create an instance of the class
            Method method = clazz.getMethod(methodName);  // Get the method dynamically
            method.invoke(obj);  // Call the method on the instance
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate class: " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Illegal access: " + e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + e.getMessage());
        } catch (InvocationTargetException e) {
            System.out.println("Method threw an exception: " + e.getCause());
        }
//        finally {
//            scanner.close();
//        }
    }
}
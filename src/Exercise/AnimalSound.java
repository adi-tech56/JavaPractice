package Exercise;

import java.util.Scanner;

class Animal {
    public void makeSound() {
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}

class Duck extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Quack");
    }
}


public class AnimalSound {
    private static boolean isElementPresent(int[] arr, int key) {

        for (int element : arr) {
            if (element == key) {
                return true;
            }
        }

        return false;
    }

    private static void userInput(int p) {
        switch (p) {
            case 1: {
                Dog a = new Dog();
                a.makeSound();
            }
            break;
            case 2: {
                Cat a = new Cat();
                a.makeSound();
            }
            break;
            case 3: {
                Cow a = new Cow();
                a.makeSound();
            }
            break;
            case 4: {
                Duck a = new Duck();
                a.makeSound();
            }
            break;
            default: {
                System.out.println("Enter valid number for animal");
            }


        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Ani[] = {1, 2, 3, 4};
        boolean res = false;
        int p;
        System.out.println("Enter 1 for Dog 2 for Cat and 3 for cow 4 for duck");
        while (!res) {
            p = s.nextInt();
            res = isElementPresent(Ani, p);
            userInput(p);
        }


    }
}

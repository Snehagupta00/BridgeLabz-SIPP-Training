package Inheritance;

 class Animal {

     String name;
     int age;

     Animal(String name, int age) {
         this.name = name;
         this.age = age;
     }


     void makeSound() {
         System.out.println("animal sound");
     }

     void showInfo() {
         System.out.println("Name: " + name + ", Age: " + age);
     }
 }

class Dog extends Animal{
     Dog(String name,int age){
         super(name, age);
     }

    @Override
    void makeSound() {
        System.out.println("Dog meows: Bark Bark!");
    }
}

class Cat extends Animal{
     Cat(String name,int age){
         super(name, age);
     }

    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}


class Bird extends Animal{
    Bird(String name,int age){
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bird : Tweet Tweet!");
    }
}


public class AnimalHierarchyDemo {
    public static void main(String[] args) {
        // Using polymorphism
        Animal dog = new Dog("Tommy", 4);
        Animal cat = new Cat("Kitty", 2);
        Animal bird = new Bird("Tweety", 1);

        // Call overridden methods
        dog.showInfo();
        dog.makeSound();

        cat.showInfo();
        cat.makeSound();

        bird.showInfo();
        bird.makeSound();
    }
}

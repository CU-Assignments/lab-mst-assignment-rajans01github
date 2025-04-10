// QUESTION 2:
// Demonstrate the concept of Inheritance by creating a base class and a derived class with appropriate methods and fields.

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void speak() {
        System.out.println(name + " barks.");
    }
}

public class Question2_Inheritance {
    public static void main(String[] args) {
        Animal a = new Animal("Animal");
        Dog d = new Dog("Tommy");

        a.speak(); // Output: Animal makes a sound.
        d.speak(); // Output: Tommy barks.
    }
}

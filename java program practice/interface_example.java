interface Ani {
    // Method
    void eat();

    void sleep();
}

class Dog implements Ani {
    public void eat() {
        System.out.println("Method of eating");
    }

    public void sleep() {
        System.out.println("Method of sleeping");
    }
}

class Cat implements Ani {
    // Implementing interface methods
    public void eat() {
        System.out.println("eating Method");
    }

    public void sleep() {
        System.out.println("sleeping Method");
    }
}

public class interface_example {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.sleep();
    }
}

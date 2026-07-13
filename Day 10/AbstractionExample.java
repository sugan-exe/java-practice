abstract class Day10Animal {
    String name;

    Day10Animal(String name) {
        this.name = name;
    }

    abstract void sound();
    abstract void eat();

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Day10Dog extends Day10Animal {
    Day10Dog(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " says: Woof!");
    }

    void eat() {
        System.out.println(name + " eats bones");
    }
}

class Day10Cat extends Day10Animal {
    Day10Cat(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " says: Meow!");
    }

    void eat() {
        System.out.println(name + " eats fish");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Day10Dog d = new Day10Dog("Bruno");
        d.sound();
        d.eat();
        d.sleep();

        System.out.println();

        Day10Cat c = new Day10Cat("Kitty");
        c.sound();
        c.eat();
        c.sleep();
    }
}

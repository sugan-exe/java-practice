class Day10Parent {
    String name;

    Day10Parent(String name) {
        this.name = name;
        System.out.println("Parent constructor called");
    }

    void show() {
        System.out.println("Parent name: " + name);
    }
}

class Day10Child extends Day10Parent {
    int age;

    Day10Child(String name, int age) {
        super(name);
        this.age = age;
        System.out.println("Child constructor called");
    }

    void show() {
        super.show();
        System.out.println("Child age: " + age);
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        Day10Child c = new Day10Child("Varun", 20);
        System.out.println();
        c.show();
    }
}

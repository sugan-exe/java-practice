abstract class AbstractAnimal {
    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class AbstractCat extends AbstractAnimal {
    void sound() {
        System.out.println("Cat says: Meow");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        AbstractCat c = new AbstractCat();
        c.sound();
        c.sleep();
    }
}

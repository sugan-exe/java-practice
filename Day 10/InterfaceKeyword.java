interface InterfaceDrawable {
    void draw();
}

interface InterfaceColorable {
    void fillColor(String color);
}

class InterfaceCircle implements InterfaceDrawable, InterfaceColorable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    public void fillColor(String color) {
        System.out.println("Filling circle with " + color);
    }
}

class InterfaceRectangle implements InterfaceDrawable, InterfaceColorable {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    public void fillColor(String color) {
        System.out.println("Filling rectangle with " + color);
    }
}

public class InterfaceKeyword {
    public static void main(String[] args) {
        InterfaceCircle c = new InterfaceCircle();
        c.draw();
        c.fillColor("Red");

        System.out.println();

        InterfaceRectangle r = new InterfaceRectangle();
        r.draw();
        r.fillColor("Blue");
    }
}

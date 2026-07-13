class AccessPerson {
    private String name;
    private int age;

    public AccessPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        AccessPerson p = new AccessPerson("Varun", 20);
        p.display();

        System.out.println("Name using getter: " + p.getName());
        System.out.println("Age using getter: " + p.getAge());

        p.setName("Rahul");
        System.out.println("Updated Name: " + p.getName());
    }
}

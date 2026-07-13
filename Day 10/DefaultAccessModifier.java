class DefaultEmployee {
    String name;
    int age;
    double salary;

    DefaultEmployee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class DefaultAccessModifier {
    public static void main(String[] args) {
        DefaultEmployee e1 = new DefaultEmployee("Varun", 20, 50000);
        DefaultEmployee e2 = new DefaultEmployee("Rahul", 22, 60000);

        e1.display();
        System.out.println();
        e2.display();

        System.out.println();

        e1.name = "Amit";
        e1.salary = 70000;
        System.out.println("After changing values:");
        e1.display();
    }
}

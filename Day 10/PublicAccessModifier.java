class PublicStudent {
    public String name;
    public int rollNo;
    public String grade;

    public PublicStudent(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
    }
}

public class PublicAccessModifier {
    public static void main(String[] args) {
        PublicStudent s = new PublicStudent("Varun", 101, "A");
        s.display();

        System.out.println();

        s.name = "Rahul";
        s.rollNo = 102;
        s.grade = "B";
        System.out.println("After changing values:");
        s.display();
    }
}

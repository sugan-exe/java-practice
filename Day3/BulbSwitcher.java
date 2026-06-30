import java.util.Scanner;

public class BulbSwitcher {

    public static int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bulbs: ");
        int n = sc.nextInt();

        System.out.println("Bulbs ON = " + bulbSwitch(n));

        sc.close();
    }
}
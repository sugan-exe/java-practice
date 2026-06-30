import java.util.Scanner;

public class DoubleReversal {

    public static boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(isSameAfterReversals(num));

        sc.close();
    }
}
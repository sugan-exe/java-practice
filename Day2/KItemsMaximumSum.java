import java.util.Scanner;

public class KItemsMaximumSum {

    public static int kItemsWithMaximumSum(int numOnes, int numZeros,
            int numNegOnes, int k) {

        if (k <= numOnes)
            return k;

        if (k <= numOnes + numZeros)
            return numOnes;

        return numOnes - (k - numOnes - numZeros);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Ones: ");
        int ones = sc.nextInt();

        System.out.print("Number of Zeros: ");
        int zeros = sc.nextInt();

        System.out.print("Number of Negative Ones: ");
        int negOnes = sc.nextInt();

        System.out.print("Value of k: ");
        int k = sc.nextInt();

        System.out.println("Maximum Sum = " +
                kItemsWithMaximumSum(ones, zeros, negOnes, k));

        sc.close();
    }
}
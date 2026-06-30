import java.util.Scanner;

public class AccountBalance {

    public static int accountBalanceAfterPurchase(int purchaseAmount) {

        int rounded = ((purchaseAmount + 5) / 10) * 10;

        return 100 - rounded;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        int purchaseAmount = sc.nextInt();

        System.out.println("Remaining Balance = " +
                accountBalanceAfterPurchase(purchaseAmount));

        sc.close();
    }
}
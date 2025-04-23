import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);

        float bankBalance;
        int stockEarnings;
        double expenses;
        String name = "customer";

        System.out.println("Please enter your starting bank balance as a decimal: ");
        bankBalance = in.nextFloat();
        System.out.print("Please enter your annual stock dividends as a whole number: ");
        System.out.print("\n");
        stockEarnings = in.nextInt();
        System.out.print("Please enter your approximate monthly expenses as a decimal: \n");
        magicSpending = in.nextDouble();

        //Ignore this part, it's for me
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //Ignore it! You won't need it!

        System.out.printf("Your current finances, %s: %n", name);
        System.out.printf("Bank Balance:%10.2f for %s%n", bankBalance, name);
        System.out.printf("Stock Earnings:%8d %n", stockEarnings);

    }
}

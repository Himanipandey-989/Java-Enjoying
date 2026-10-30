import java.util.Scanner;
public class StretchChallege2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("💰💰💰💰💰💰💰💰FINANCE SUMMARY💰💰💰💰💰💰💰💰💰");
        System.out.print("USER NAME :");
        String name = sc.nextLine();

        System.out.print("MONTHLY INCOME :");
        int amount = sc.nextInt();
        sc.nextLine();

        System.out.print("MONTHLY BUDGET:");
        int budget = sc.nextInt();
        sc.nextLine();

        System.out.print("Total Expense :");
        int expense = sc.nextInt();
        sc.nextLine();

        int Remaining = amount-expense;
        System.out.println("Remaining Income :"+Remaining);

        int BG = budget-expense;
        System.out.println("Budget remaining :"+BG);


        System.out.print("Saving Goal :");
        int save =sc.nextInt() ;


        System.out.println("===============================================================");
    }}






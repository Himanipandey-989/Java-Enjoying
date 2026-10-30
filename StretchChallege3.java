import java.util.Scanner;
public class StretchChallege3 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("=====================================================================");
        System.out.println("---------------------PERSONAL FINANCE HEALTH REPORT------------------       " );
        System.out.println("=====================================================================");
        System.out.print("USER NAME :");
        String name = sc.nextLine();

        System.out.print("MONTHLY INCOME :");
        int amount = sc.nextInt();
        sc.nextLine();

        System.out.print(" BUDGET:");
        int budget = sc.nextInt();
        sc.nextLine();

        System.out.print(" Expense :");
        int expense = sc.nextInt();
        sc.nextLine();

        System.out.print("Current Saving :");
        int current =sc.nextInt() ;

        System.out.print("Saving Goal :");
        int save =sc.nextInt() ;


        int Remaining = amount-expense;
        System.out.println("Remaining Income :"+Remaining);

        int BG = budget-expense;
        System.out.println("Budget remaining :"+BG);

        int afteronemonth=current+Remaining;
        System.out.println("Saving after one month :"+afteronemonth);

        boolean expenseexceedbudget=expense>budget;
        System.out.println("expense exceed the budget:"+expenseexceedbudget);

        boolean expenseexceedincome=expense>=amount;
        System.out.println("expense exceed the income:"+expenseexceedincome);

        boolean reachedgoal=afteronemonth>=save;
        System.out.println("the saving goal reached after one month :"+reachedgoal);







        System.out.println("===============================================================");
    }}









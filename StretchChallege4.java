import java.util.Scanner;
public class StretchChallege4 {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("---------------------PERSONAL FINANCE ALERT V1------------------       " );
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


        System.out.print("Saving Goal :");
        int save =sc.nextInt() ;


        int Remaining = amount-expense;
        System.out.println("Remaining Income :"+Remaining);
        if (expense>budget){
            System.out.println("over budget");

    }
        else if (expense>=amount){
            System.out.println("Exceed the income");
        }
        else if (Remaining<save){
            System.out.println("Within in the budget but saving goal not met");
        }
        else{
            System.out.println("Budget and saving goal on track");
        }
    }
}

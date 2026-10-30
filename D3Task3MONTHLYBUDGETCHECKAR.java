import java .util.Scanner;
public class D3Task3MONTHLYBUDGETCHECKAR {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Monthly income :");
        int month=sc.nextInt();
        System.out.println("Budget :");
        int budget=sc.nextInt();
        System.out.println("Expense :");
        int expense=sc.nextInt();

        int Remaining =month-expense;
        System.out.println("Remaining income:"+Remaining);

        int RemainingBudget= budget-expense;
        System.out.println("Remaining Budget :"+RemainingBudget);
        boolean isWithinTheBudget=expense<=budget;
        System.out.println("Is expense with in Budget :"+ isWithinTheBudget);


        boolean isWithinIncome=expense<=month;
        System.out.println("Is expense with in Income:"+isWithinIncome);
        boolean isMoneyleft=Remaining>0;
        System.out.println("Any Money is left or not? :"+isMoneyleft);
    }
}

import java .util.Scanner;
public class D3Task5SmartSpendingConditions {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.print("ENTER THE INCOME:");
     int income = sc.nextInt();
        System.out.print("ENTER THE BUDGET:");
        int budget = sc.nextInt();

        System.out.print("ENTER THE Expense1:");
        int expense1 = sc.nextInt();
        boolean withinbudget= expense1<=budget;
        boolean withincome= expense1<=income;
        boolean withinBudgetOrIncome=withinbudget && withincome;
        System.out.println("expense with in budget and income"+withinBudgetOrIncome);
        boolean exceedsBudgetorincome=expense1>budget||expense1>income;
        System.out.println("expense exceed the budget or income"+exceedsBudgetorincome);

        boolean notwithbudget=!withinbudget;
        System.out.println("expense not  the budget or income"+notwithbudget);



    }
}

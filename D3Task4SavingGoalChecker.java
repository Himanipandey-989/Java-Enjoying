import java.util.Scanner;
public class D3Task4SavingGoalChecker {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("MONTHLY INCOME:");
        int IN=sc.nextInt();
        System.out.print("MONTHLY EXPENSE :");
        int EX=sc.nextInt();
        System.out.print("CURRENT SAVINGS :");
        int SA=sc.nextInt();
        System.out.print("TARGET SAVINGS :");
        int TA=sc.nextInt();
        int RE=IN-EX;
        System.out.println("REAMINING INCOME :"+ RE);

        int ES=SA+RE;
        System.out.println("ESTIMATE TOTAL SAVING:"+ES);
        boolean ReachesToTarget=(TA<=ES);
        System.out.println("REACHES TO TARGET :"+ReachesToTarget);

    }
}

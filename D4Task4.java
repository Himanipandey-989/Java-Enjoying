import java.util.Scanner;
public class D4Task4 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the monthly income :" );
        int income= sc.nextInt();
        System.out.print("Enter the Budget :" );
        int budget= sc.nextInt();
        System.out.print("Enter the Expense :" );
        int expense= sc.nextInt();
        if (expense>income) {
            System.out.println("Expense greater than the Income ");
        }

        else if (expense<=budget){
            System.out.println("Expense in the Budget ");
        }
        else if (expense>budget){
            System.out.println("Expense is out of Budget");
        }
        else {
        System.out.println("invalid ");}
    }

}

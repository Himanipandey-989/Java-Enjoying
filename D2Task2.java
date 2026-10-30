import java.util.Scanner;

public class D2Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("................................................................");
        System.out.println("                       EXPENSE TRACKER");
        System.out.println(".................................................................");

        System.out.print(" CATEORY NAME :");
        String name= sc.nextLine();

        System.out.print("Expense Amount  :");
        int amount= sc.nextInt();
        sc.nextLine();

        System.out.print("PAYMENT METHOD [upi/ cash/card]:");
        String payment= sc.nextLine();

        System.out.print("is it necessary ?  :");
        boolean necessary= sc.nextBoolean();

        System.out.println("................................................................");
        System.out.println("                       Report");
        System.out.println(".................................................................");
        System.out.println("Cateory name  :"+name);
        System.out.println("Amount  :"+amount);
        System.out.println("Payment  :"+ payment);
        System.out.println("Expense necessary:"+necessary);




    }
}


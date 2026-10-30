import java .util.Scanner;
public class D2Task3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("💠💠💠💠💠💠💠💠💠💠💠💠💠MONTHLY BUDGET💠💠💠💠💠💠💠💠💠💠💠💠💠");
                System.out.print("INCOME :");
                double income=sc.nextDouble();

        System.out.print("RENT :");
        double rent=sc.nextDouble();

        System.out.print("FOOD :");
        double food=sc.nextDouble();

        System.out.print("TRAVEL :");
        double travel=sc.nextDouble();

        System.out.print("OTHER :");
        double other=sc.nextDouble();

        System.out.println("==================================================================");

        System.out.println("TOTAL EXPENSES :" + ( rent +food+travel+other));
        double remaining =(income-(rent +food+travel+other));
        System.out.println("REMAINING INCOME:"+ remaining);


        System.out.println("====================================================================");


    }
}

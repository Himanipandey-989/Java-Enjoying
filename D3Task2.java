import java .util.Scanner;
public class D3Task2 {
    public static void main(String[] args ){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the first Subject marks:");
             double a=sc.nextDouble();
        System.out.println("Enter the second Subject marks:");
        double b=sc.nextDouble();

        System.out.println("Enter the third Subject marks:");
        double  c=sc.nextDouble();
        double  total = (a+b+c);
        System.out.println("The total marks is :"+total);
        double average= (a+b+c)/3;
        System.out.println("The Average marks is :"+average);

    }


}

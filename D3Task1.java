import java.util.Scanner;

public class D3Task1 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value A:");
        int A = sc.nextInt();
        System.out.println("Enter the value B:");
        int B = sc.nextInt();
        int sum = A + B;
        System.out.println("The Addition is:" + sum);
        int sub = A - B;
        System.out.println("The Subtraction is:" + sub);
        int multi = A * B;
        System.out.println("The Multiplication is:" + multi);
        int div = A / B;
        System.out.println("The sum is:" + div);
        int rem = A % B;
        System.out.println("The Reminder is:" + rem);
    }}

import java .util.Scanner;
public class TaskThird {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the value A:");
     int A= sc.nextInt();
     System.out.println("Enter the value B:");
     int B= sc.nextInt();
     System.out.println("Select the operation which you perform: 1 Add , 2 Sub , 3 Multi ,4 Div");
     int OP= sc.nextInt();
     if (OP==1){
         System.out.println("Addition is :"+ (A+B));}
     else if(OP==2){
         System.out.println("Subtraction is :"+ (A -  B));}
     else if (OP==3){
            System.out.println("Multiplication  is :"+ (A*B));}
     else if (OP==4){
         System.out.println("Division is :"+ (A/B));}
        else{
            System.out.println("Invalid error");}
     }

    }


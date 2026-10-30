import java .util.Scanner;
public class StretchChallege {
    public static void main(String [] args){
      Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks of Daa:");
        int Daa=sc.nextInt();
        System.out.println("Enter the marks of Dbms:");
        int Dbms=sc.nextInt();
        System.out.println("Enter the marks of Dbms:");
        int Dwdm = sc.nextInt();
        System.out.println("Enter the marks of Dbms:");
        System.out.println("-----------------------------------------------------");
        System.out.println("               STUDENT REPORT                         ");
        System.out.println("------------------------------------------------------");
        System.out.println(" NAME   = HIMANI PANDEY");
        System.out.println(" COURSE = BTECH CSE");
        System.out.println("                 RESULT                                ");
        System.out.println(" DAA ="+Daa);
        System.out.println(" DBMS="+Dbms);
        System.out.println(" DWDM="+Dwdm);
        System.out.println("=========================================================");
        System.out.println(" Total marks   =" + (Daa+Dbms+Dwdm));
        System.out.println(" Average marks = "+(Daa+Dbms+Dwdm)/3);

    }
}

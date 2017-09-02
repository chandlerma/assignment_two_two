import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your balance, and interest rate (e.g., 3 for 3%)");
        double balance = scan.nextDouble();
        double intR = scan.nextDouble();

        double interest = balance * ( intR / 1200);

        System.out.println("the interest is " + interest);

    }

}

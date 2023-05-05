import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {// tính lãi xuất trên vốn đầu tư
        double money = 1.0;
        int month;
        double interestRate = 1.0;
        System.out.println("Enter investment amount: ");
        money  = new Scanner(System.in).nextInt();
        System.out.println("Enter number of months: ");
        month = new Scanner(System.in).nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = new  Scanner(System.in).nextDouble();
        double totalInterest = 0;
        for(int i=0;i<month;i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);


    }
}

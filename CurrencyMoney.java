import java.util.Scanner;

public class CurrencyMoney {
    public static void main(String[] args) {
        int rate = 24000;
        System.out.println("nhập vào số tiền (USD) : ");
        int amountUsd = new Scanner(System.in).nextInt();
        int amountVnd = rate*amountUsd;
        System.out.println(amountUsd +" = "+amountVnd +" VND");
    }
}

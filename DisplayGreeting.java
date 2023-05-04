import java.util.Scanner;

public class DisplayGreeting {
    public static void main(String[] args) {
        System.out.print("nhập vào tên của bạn : ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Xin chào bạn "+name);
    }
}

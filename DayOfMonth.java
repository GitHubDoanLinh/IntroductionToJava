import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        System.out.println("Chương trình tính số ngày trong 1 tháng");
        int month = new Scanner(System.in).nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng "+month+" có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+month+" có 30 ngày");
                break;
            case 2:
                System.out.println("tháng 2 có 28 ngày, riêng năm nhuận có 29 ngày");
                break;
            default:
                System.out.println("Nhập sai tháng ");

        }

    }
}

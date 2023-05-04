import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 năm bất kỳ");
        int year = sc.nextInt();
        if(year<0){
            System.out.println("năm không có số âm !!!");
        }
        else {
            if(year%400==0){
                System.out.println("năm "+year+" là năm nhuận");
            } else if (year%4==0 && year%100 != 0) {
                System.out.println("năm "+year+" là năm nhuận");
            }
            else {
                System.out.println("năm "+year+" không là năm nhuận");
            }
        }
    }
}

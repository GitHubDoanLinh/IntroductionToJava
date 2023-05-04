import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        System.out.println("nhap vao canh chu nhat");
        float a = new Scanner(System.in).nextInt();
        System.out.println("nhap vao canh chu hai");
        float b = new Scanner(System.in).nextInt();
        float area = a*b;
        System.out.println("Dien tich hinh chu nhat = "+area);


    }
}

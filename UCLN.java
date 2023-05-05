import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        System.out.print("nhap vao so thu nhat : ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("nhap vao so thu hai : ");
        int b = new Scanner(System.in).nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 || b==0){
            System.out.println("Không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Uoc chung lon nhat : " + a);

    }
}

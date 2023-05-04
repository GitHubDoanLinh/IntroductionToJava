import java.util.Scanner;

public class PTB1 {
    public static void main(String[] args) {
        // Chương trình giải phương trình bậc nhất
        System.out.println("Nhap vao he so a ");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("Nhap vao he so b ");
        float b = new Scanner(System.in).nextFloat();
        if(a==0){
            if (b==0){
                System.out.println("Phương trình vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else{
            if(b==0){
                System.out.println("Phương trình có nghiệm x = 0 ");
            }
            else{
                System.out.println("Phương trình có nghiệm x = "+ (-b/a));
            }
        }


    }
}

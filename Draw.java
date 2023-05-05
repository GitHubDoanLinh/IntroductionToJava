import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        System.out.print("nhap vao chieu cao : ");
        int h = new Scanner(System.in).nextInt();
        System.out.print("nhap vao chieu rong : ");
        int w = new Scanner(System.in).nextInt();
        for (int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                System.out.print("*"+"   ");
            }
            System.out.println("\n");
        }
        System.out.println("-------------------");
        for(int k=0;k<h;k++){
            for(int l=k;l<h;l++){
                System.out.print("*"+"   ");
            }
            System.out.println("\n");
        }
//        System.out.println("---------------------");
//        for(int k=0;k<h;k++){
//            for(int l=k;l<h;l++){
//                System.out.print(""+"    ");
//            }
//            System.out.println("\n");
//        }
    }
}

import java.util.Scanner;

public class BimCalculator {
    public static void main(String[] args) {
        System.out.println("Chương trình tính chỉ số cân nặng của cơ thể");
        System.out.print("Nhập vào chỉ số bmi : ");
        float bmi = new Scanner(System.in).nextFloat();
        if(bmi<18.5){
            System.out.println("Under weight");
        } else if (bmi>=18.5 && bmi<=25) {
            System.out.println("Normal");
        } else if (bmi>=25 && bmi<30) {
            System.out.println("Over weight !");
        }
        else {
            System.out.println("Obese !");
        }
    }
}

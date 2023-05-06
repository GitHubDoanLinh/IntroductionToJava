import java.util.Scanner;

public class TwentyFirstPrime {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("20 so nguyen to dau tien : ");
        for (int i = 2; count < 20; i++) {
            boolean isPrime = true;
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==true){
                System.out.println(i+ "\t");
                count++;
            }
        }
    }
}

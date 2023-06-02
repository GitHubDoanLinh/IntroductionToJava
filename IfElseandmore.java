package communityuni.com;

import java.util.Scanner;

public class IfElseandmore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("moi nhap vao 1 thang : ");
		int month = sc.nextInt();
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			System.out.println("thang "+month+" co 31 ngay");
		}
		else if(month==4||month==6||month==9||month==11)
		{
			System.out.println("thang "+month+" co 30 ngay");

		}
		else if(month==2)
		{
			System.out.println(" thang 2 cua nam nhuan co 29 ngay, con lai la 28 ngay");
		}
		else
		{
			System.out.println(" ban nhap thang sai roi");
		}
		

	}

}

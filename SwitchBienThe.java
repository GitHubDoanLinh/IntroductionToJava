package communityuni.com;

import java.util.Scanner;

public class SwitchBienThe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap vao 1 thang");
		int m = sc.nextInt();
		switch(m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("thang "+m+" co 31 ngay");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("thang "+m+" co 30 ngay");
				break;
			case 2:
				System.out.println("moi nhap vao 1 nam chua thang 2");
				int y = sc.nextInt();
				if((y%4==0 && y%100!=0)||y%400==0)
					System.out.println("thang "+m+" nam "+y+" co 29 ngay ");
				else
					System.out.println("thang "+ m + "nam "+y+" co 28 ngay");
				break;
			default:
				System.out.println("ban da nhap sai thang ");
				break;
			
			
		}
		

	}

}

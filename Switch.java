package communityuni.com;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap vao 1 thang ");
		int thang = sc.nextInt();
		switch (thang) {
		case 1:
			System.out.println("thang "+thang+" co 31 ngay");
			break;
		case 3:
			System.out.println("thang "+thang+" co 31 ngay");
			break;
		case 5:
			System.out.println("thang "+thang+" co 31 ngay");
			break;
		case 7:
			System.out.println("thang "+thang+" co 31 ngay");
			break;
		case 8:
			System.out.println("thang "+thang+" co 31 ngay");
			break;
		case 10:
			System.out.println("thang "+thang+" co 31 ngay");
			break;
		case 12:
			System.out.println("thang "+thang+" co 31 ngay");
			break;
		case 4:
			System.out.println("thang "+thang+" co 30 ngay");
			break;
		case 6:
			System.out.println("thang "+thang+" co 30 ngay");
			break;
		case 9:
			System.out.println("thang "+thang+" co 30 ngay");
			break;
		case 11:
			System.out.println("thang "+thang+" co 30 ngay");
			break;
		case 2:
			System.out.println("thang "+thang+" co 28 or 29 ngay");
			break;
		default:
			System.err.println("ban da nhap sai thang");
			break;
		}

	}

}

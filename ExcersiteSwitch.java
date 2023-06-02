package communityuni.com;

import java.util.Scanner;

public class ExcersiteSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("moi ban nhap so a");
			int a = sc.nextInt();
			System.out.println("moi ban nhap so b");
			int b = sc.nextInt();
			System.out.println("moi ban nhap phep toan : ");
			char ch = new Scanner(System.in).nextLine().charAt(0);
			switch (ch) {
			case '+':
				System.out.println(a + " + " +b+ " = "+ (a+b));
				break;
			case '-':
				System.out.println(a + " - " +b+ " = "+ (a-b) );
				break;
			case '*':
				System.out.println(a + " * " +b+ " = "+ (a*b) );
				break;
			case '/':
				if(b==0)
					System.out.println("mau = 0");
				else
					System.out.println(a + " / " +b+ " = "+ (a/b) );
				break;
			
			default:
				System.err.println("nhap sai phep toan ");
				break;
				
				}
			System.out.println("ban co muon tiep tuc ? (y/n)");
			String line  = new Scanner(System.in).nextLine();
			if(line.equalsIgnoreCase("n"))
				break;
		}
		System.out.println("tro choi ket thuc ");

	}
	
}

package edoc10week;

import java.util.Scanner;

public class b9656 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int remainder= n%4;
		switch(remainder) {
			case 0:
					System.out.println("SK");
					break;
			case 1:
					System.out.println("CY");
					break;
			case 2:
					System.out.println("SK");
					break;
			case 3:
					System.out.println("CY");
		}
		sc.close();
	}

}

package edoc2_5week;

import java.util.Scanner;

public class b1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		while(n>0) {
			
			int a= sc.nextInt();
			int b= sc.nextInt();
			
			int max= Math.max(a, b);
			
			int min= Math.min(a, b);
			
			int result=1;
			
			for(int i=max; i>min; i--) { //а╤гу
				result=result*i/(max-i+1);
			}
			System.out.println(result);
			n--;
		}
	}

}

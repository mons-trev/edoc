package edoc8week;

import java.util.Arrays;
import java.util.Scanner;

public class b9076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int s[]= new int[5];
		int n= sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<5; j++) {
			s[j]=sc.nextInt();
			}
			Arrays.sort(s);
			
			  if(s[4]-s[1]<4) {
			 
				int sum=0;
				for(int k=1; k<4; k++) {
					sum+=s[k];
				}
				System.out.println(sum);
			}
			else {
				System.out.println("KIN");
			}
			sc.close();
		}
	}

}

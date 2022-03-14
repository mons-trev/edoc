package edoc7week;

import java.util.Scanner;

public class b11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int p []= new int[n];
		for(int i=0; i<n; i++) {
			p[i]=sc.nextInt();
		}
		int i;
		int j;
		int temp;
		int index;
		for(i=0; i<n-1; i++) {
			for(j=i+1;j<n;j++) {
				if(p[j]<p[i]) {
					temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
		int sum1=0;
		int sum2=0;
		for(i=0; i<n; i++) {
			sum1+=p[i];
			sum2+=sum1;
		}
		System.out.println(sum2);
	}

}

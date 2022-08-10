package edoc2_3week;

import java.util.Scanner;

public class b10815 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int m= sc.nextInt();
		int compare[] = new int[m];
		for(int i=0; i<m; i++) {
			compare[i]= sc.nextInt();
		}
		boolean flag= false;
		for(int i=0; i<m; i++) {
			flag=false;
			for(int j=0; j<n; j++) {
				if(arr[j]==compare[i]) {
					System.out.print("1 ");
					flag= true;
					break;
				}
			}
			if(!flag) {
				System.out.print("0 ");
			}
		}
	}

}

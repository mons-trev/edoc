package edoc6week;

import java.util.Scanner;
import java.util.Stack;

public class epper9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int sum;
		String inputs[] = new String[n];
		for (int i=0; i<n; i++) inputs[i] = sc.next();
		String answer[]= new String[n];
		String tc;
		for(int i=0; i<n; i++) {
			sum=0;
			tc=inputs[i];
			for(int j=0; j<tc.length(); j++) {
				
				if(tc.charAt(j)=='(') {
					sum++;
				}
				else if(tc.charAt(j)==')') {
					sum--;
				}
				if(sum<0) {
					answer[i]="NO";
					break;
				}
			}
			if(sum==0) {
				answer[i]="YES";
			}
			else if(sum>0){
				answer[i]="NO";
			}
		}
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}

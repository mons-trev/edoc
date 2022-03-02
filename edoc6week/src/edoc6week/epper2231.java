package edoc6week;

import java.util.Scanner;

public class epper2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int max= 1000000;
		String val;
		int sum;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int result=0;
		for(int i=1;i<max;i++) {
			sum=0;
			val=Integer.toString(i);
			for(int j=0; j<val.length();j++) {
				sum=sum+Character.getNumericValue(val.charAt(j));
				
			}
			sum=sum+Integer.parseInt(val);
			if(sum==n) {
				result=i;
				break;
			}
			else {
				continue;
			}
		}
		System.out.println(result);
}
}

package edoc8week;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class b1431 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		String[] arr= new String[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.next();
		}
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length()==o2.length()) {
					int sum1=0;
					int sum2=0;
					for(int i=0; i<o1.length(); i++) {
						if(o1.charAt(i)<='9'&&o1.charAt(i)>='0') {
							sum1+=Character.getNumericValue(o1.charAt(i));
						}
					}
					for(int i=0; i<o2.length(); i++) {
						if(o2.charAt(i)<='9'&&o2.charAt(i)>='0') {
							sum2+=Character.getNumericValue(o2.charAt(i));
						}
					}
					if(sum1==sum2)
						return o1.compareTo(o2);
					else
						return sum1-sum2;
				}
				else {
					return o1.length()-o2.length();
				}
				
			}
			
		});
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}

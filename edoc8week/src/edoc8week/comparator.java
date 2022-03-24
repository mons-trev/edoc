package edoc8week;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] n= new String[5];
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<5; i++) {
			n[i]=sc.next();
		}
		Arrays.sort(n, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				System.out.println(o1+","+o2);
				return 0;
			}
			
		});
	}

}

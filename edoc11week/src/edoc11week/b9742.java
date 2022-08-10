package edoc11week;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class b9742 {

	static int fact(int a) {
		
		if(a<=1) return 1;
		else {
			return fact(a-1)*a;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc= new Scanner(System.in);
			String s= sc.next();
			char [] array= s.toCharArray();
			Arrays.sort(array);
			Vector<Character> vector= new Vector<>();
			for(int i=0; i<array.length; i++) {
				vector.add(array[i]);
			}
			int n= sc.nextInt();
			int k=n;
			n=n-1;
			String result="";
			if(n>=fact(array.length)) {
				System.out.println("No permutation");
				break;
			}
			for(int i=array.length-1; i>=0; i--) {
				result+=vector.elementAt(n/fact(i));
				vector.remove(n/fact(i));
				n=n%fact(i);
			}
			System.out.println(s+" "+k+" = "+ result);
		}
	}

}

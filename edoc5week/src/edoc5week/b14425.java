package edoc5week;

import java.util.Scanner;
import java.util.Vector;

public class b14425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int M= sc.nextInt();
		Vector<String> s= new Vector<>();
		for(int i=0; i<N; i++) {
			s.add(sc.next());
		}
		int j=0;
		int count=0;
		while(j<M) {
			String compare= sc.next();
			for(int i=0; i<N; i++) {
				if(compare.equals(s.get(i))) {
					count++;
					break;
				}
			}
			j++;
		}
		System.out.println(count);
		sc.close();
	}

}

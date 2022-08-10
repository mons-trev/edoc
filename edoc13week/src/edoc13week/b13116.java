package edoc13week;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;


public class b13116 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		while(n>0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			Vector<Integer> avector= new Vector<>();
			Vector<Integer> bvector= new Vector<>();
			
			while(a>=1) {
				avector.add(a);
				a=a/2;
			}
			
			while(b>=1) {
				bvector.add(b);
				b=b/2;
			}
			
			int min= Math.min(avector.size(), bvector.size());
			
			//System.out.println(min);
			
			int max=1;
			
			//System.out.println(avector);
			//System.out.println(bvector);
		
			//System.out.println(avector.get(0)==bvector.get(0));
			//System.out.println(avector.get(1)==bvector.get(1));
			//System.out.println(avector.get(2)==bvector.get(2));
			
			for(int i=1; i<=min; i++) {
				
				if(avector.get(avector.size()-i).equals(bvector.get(bvector.size()-i))) {
					max= bvector.get(bvector.size()-i);
				}
				else break;
			}
			
			System.out.println(10*max);
			
			avector.clear();
			bvector.clear();
			
			n--;
		}
	}

}

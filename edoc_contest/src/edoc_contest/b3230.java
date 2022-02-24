package edoc_contest;

import java.util.ArrayList;
import java.util.Scanner;

public class b3230 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> rank = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		rank.add(0,0);
		for(int i=1; i<=a; i++) {//¼±¼ö
			rank.add(sc.nextInt(), i);
		}
	
		
		ArrayList<Integer> rank2= new ArrayList<>();
		rank2.add(0, 0);
		for(int i=b; i>=1; i--) {
			int per= rank.get(i);
			rank2.add(sc.nextInt(),per);
		}
		for(int i=1; i<4; i++) {
			System.out.println(rank2.get(i));
		}
	}

}

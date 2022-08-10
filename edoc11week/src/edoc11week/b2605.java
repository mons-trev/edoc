package edoc11week;

import java.util.Scanner;
import java.util.Vector;

public class b2605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int student_num= sc.nextInt();
		int number_pick[] = new int[student_num];
		Vector<Integer> list= new Vector<>();
		for(int i=0; i<number_pick.length; i++) {
			number_pick[i] = sc.nextInt();
		}
		for(int i=0; i<number_pick.length; i++) {
			list.add(list.size()-number_pick[i], i+1);
		}
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.elementAt(i)+" ");
		}
	}

}

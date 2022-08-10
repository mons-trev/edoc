package edoc2_2week;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class b10866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> al = new LinkedList<>();
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		StringBuffer print= new StringBuffer();
		for(int i=0; i<N; i++) {
			String s=sc.next();
			if(s.equals("push_back")) {
				al.addLast(sc.nextInt());
				continue;
			}
			if(s.equals("push_front")) {
				al.addFirst(sc.nextInt());
				continue;

			}
			if(s.equals("front")) {
				if(al.size()==0) print.append(-1).append('\n');
				else{
					print.append(al.peekFirst()).append('\n');
				}
				continue;

			}
			if(s.equals("back")) {
				if(al.size()==0) print.append(-1).append('\n');
				else {
					print.append(al.peekLast()).append('\n');
				}
				continue;

			}
			if(s.equals("empty")) {
				if(al.isEmpty()) print.append(1).append('\n');
				else {
					print.append(0).append('\n');
				}
				continue;

			}
			if(s.equals("size")) {
				print.append(al.size()).append('\n');
				continue;

			}
			if(s.equals("pop_front")) {
				if(al.size()==0) print.append(-1).append('\n');
				else {
					print.append(al.removeFirst()).append('\n');
				}
				continue;

			}
			if(s.equals("pop_back")) {
				if(al.size()==0) print.append(-1).append('\n');
				else {
					print.append(al.removeLast()).append('\n');
				}
				continue;
			}
		}
		sc.close();
		System.out.println(print);
	}
	
}

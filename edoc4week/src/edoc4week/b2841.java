package edoc4week;

import java.util.Scanner;
import java.util.Stack;

public class b2841 {
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
			
			int n;
			int fret;
			
			Scanner sc= new Scanner(System.in);
			n= sc.nextInt();
			fret= sc.nextInt();
			
			Stack<Integer>[] stack = new Stack[7];
			for(int i=0; i<7;i++) {
				stack[i]= new Stack<Integer>();
			}
			
			for(int i=0; i<n; i++) {
				int linenum=sc.nextInt();
				int fretnum=sc.nextInt();
				
				while(!stack[linenum].isEmpty()) {
					if(stack[linenum].peek()<fretnum) {
						stack[linenum].push(fretnum);
					}
					else if(stack[linenum].peek()>fretnum) {
						stack[linenum].pop();
					}
					else {
						break;
					}
					count +=1;
				}
				
				if(stack[linenum].isEmpty()) {
					stack[linenum].push(fretnum);
					count+=1;
				}
				
				
			}
			System.out.println(count);
			sc.close();
	}

}

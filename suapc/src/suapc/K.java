package suapc;

import java.util.Scanner;
import java.util.Stack;

public class K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String line= sc.nextLine();
		int open=0;
		int close=0;
		int sp=0;
		int count=0;
		int t=0;
		Stack<Character> st= new Stack<>();
		for(int i=0; i< line.length(); i++) {
			if(line.charAt(i)=='(') {
				st.push('(');
				open++;
			}
			else if(line.charAt(i)==')'){
				st.push(')');
				close++;
			}
			sp++;
		}
		if(open>close) {// ( 가 ) 보다 많을 때,
			while(st.size()-t>0) {
				sp--;
				if(st.elementAt(st.size()-1)=='(') {
					count=1;
					break;
				}
				if(st.elementAt(sp)=='(') {//&&sp!=0
					count++;
				}
				if(sp==0&&st.elementAt(1)==')') {
					count--;
				}
				t++;
			}
		}
		else if(close>open) 
		{// )가 (보다 많을 떄
			while(st.size()-t>0) {
				sp--;	
				if(st.elementAt(sp)==')') {
					count++;
				}
				if(sp==0&&st.elementAt(sp)==')') {
					count=1;
					break;
				}
				t++;
			}
		}
		System.out.println(count);
	}

}

package edoc2_2week;

import java.util.Scanner;
import java.util.Stack;

public class b1935 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt(); //피연산자 갯수
		String q= sc.next(); //식 받기
		double operated [] = new double[N];
		for(int i=0; i<N; i++) {
			operated[i]=sc.nextInt();
		}
		
		Stack<Double> st= new Stack<>();
		
		for(int i=0; i<q.length(); i++) {
			if(q.charAt(i)=='*'||q.charAt(i)=='+'||q.charAt(i)=='-'||q.charAt(i)=='/') {
				char operator = q.charAt(i);
				double b= st.pop();
				double a= st.pop();
				switch (operator) {
				case '+':
					st.push(a+b);
					break;
				case '*':
					st.push(a*b);
					break;
				case '/':
					st.push(a/b);
					break;
				case '-':
					st.push(a-b);
					break;
				}
			}
			else {
				st.push(operated[q.charAt(i)-'A']);
			}
		}
		
		System.out.printf("%.2f", st.pop());
		
		sc.close();

	}

}

package edoc2week;

import java.util.Scanner;
import java.util.Vector;

class Stack<T>{
	private T element;
	private Vector<T> s= new Vector<>();
	private int i;
	public Stack(){
		this.i=0;
	}
	public void push(T element) {
		s.add(element);
		i++;
	};
	public T pop() {
		if(i>=0) {
		return s.get(--i);
		}
		else {
			error();
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public void error() {
		System.out.println("범위 잘못 출력");
	}

	
	public void clear() {
		s.clear();
	}
	public int size(){
		return s.size();
	}
}
public class b4583stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			boolean b= true;
			while(true) {
				Stack<Character> m= new Stack<>();
				String example= sc.nextLine();
				m.clear();
				if(example.charAt(0)=='#') {
					break;
				}
				for(int i=0; i<example.length(); i++) {
					char c= example.charAt(i);
					switch(c) {
					case 'p':
						m.push('q');
						break;
					case 'q':
						m.push('p');
						break;
					case 'b':
						m.push('d');
						break;
					case 'd':
						m.push('b');
						break;
					case 'i': 
					case 'o':
					case 'x':
					case 'v':
					case 'w':
						m.push(c);
						break;
					default:
							b=false;
							break;
					}
					if(!b) {
						System.out.println("INVALID");
						break;
					}
				}
				if(!b) {
					b=true;
					continue;
				}
				else if(b){
				for(int i=m.size()-1; i>=0;i--) {
				System.out.printf("%c", m.pop());
				}
				m.clear();
				}
				System.out.println();
			}
			sc.close();
	}

}

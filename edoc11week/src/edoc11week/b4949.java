package edoc11week;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class b4949 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Vector<String> list= new Vector<>();
			
			
			while(true) {
				String sentence= "";
				String a= sc.next();
			 if(a.equals(".")) {
				 sentence+=a;
				 break;
			 }
			 else {
				 sentence+=a;
			 
			 }
			 if(sentence.equals(".")) break;
			 list.add(sentence);
				
			}
			
			
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.elementAt(i));
		}
		for(int j=0; j<list.size(); j++) {
				String sentence= list.elementAt(j);
				Stack<Character> test= new Stack<>();
				test.clear();
			for(int i=0; i<sentence.length(); i++) {
			char w= sentence.charAt(i);
			if(w=='('||w=='[') {
				test.push(w);
			}
			else if (w==')') {
				if(test.peek()=='(') test.pop();
				else break;
			}
			else if(w==']') {
				if(test.peek()=='[') test.pop();
				else break;
			}
			if(test.size()==0) System.out.println("yes");
			else System.out.println("no");
		}
			
		}
	}

}

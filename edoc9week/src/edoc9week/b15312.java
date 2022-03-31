package edoc9week;

import java.util.Scanner;
import java.util.Vector;

public class b15312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String Jongminname=sc.next();
		String Hername=sc.next();
		Vector<Integer> firstcase= new Vector<>();
		int [] numberlist = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		for(int i=0; i<Jongminname.length(); i++) {
			firstcase.add(numberlist[((int)Jongminname.charAt(i)-65)]);
			firstcase.add(numberlist[((int)Hername.charAt(i)-65)]);
		}
		
		Vector<Integer> calculate= new Vector<>();
		Vector<Integer> calculateresult= new Vector<>();
		
		calculate=firstcase;
		//calculate 
		while(true) {
			if(calculateresult.size()==2) break;
			else {
			calculateresult.clear();
			}
			if(calculate.size()%2 == 0) {
				for(int i=0; i<calculate.size()/2; i++) {
					calculateresult.add((calculate.get(i*2)+calculate.get(i*2+1))%10);
				}
			}
			else if(calculate.size()%2 == 1) {
				for(int i=0; i<calculate.size()-1; i++) {
					calculateresult.add((calculate.get(i)+calculate.get(i+1))%10);
				}
			}
			calculate=calculateresult;
		}
		System.out.println(calculateresult.get(0));
	}

}

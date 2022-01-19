package edoc2week;

import java.util.Scanner;

public class b15904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String judge= sc.nextLine();
		
		int index=0;
		
		judge=judge.replaceAll("[^A-Z]", "");
		char[] UCPC= {'U', 'C', 'P', 'C'};
		for(int i=0; i<judge.length();i++) {
			if(judge.charAt(i)==UCPC[index]) {
				//System.out.println(judge.indexOf(i));
				index++;
				if(index==4) {
					break;
				}
			}
		}
		if(index==4) {
			System.out.println("I love UCPC");
		}
		else {
			System.out.println("I hate UCPC");
		}
		
	}

}

package edoc11week;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class b2160 {

	static int common(char [][] first, char [][] second) {
			int common=0;
			for(int i=0; i<5; i++) {
				for(int j=0; j<7; j++) {
					if(first[i][j]==second[i][j]) common++;
				}
			}
		return common;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		char maps[][][];
		int n= sc.nextInt();
		maps= new char[n][5][7];
		for(int i=0; i<n; i++) {
			for(int j=0; j<5; j++) {
				String line= sc.next();
				for(int k=0; k<7; k++) {
					maps[i][j][k]=line.charAt(k);
				}
			}
		}
		
		int common=0;
		int compare;
		int first=0;
		int last=0;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				compare=common(maps[i], maps[j]);
				if(compare>common) {
					common=compare;
					first=i+1;
					last=j+1;
				}
			}
			
		}
		System.out.println(first +" "+last);
		
	}

}

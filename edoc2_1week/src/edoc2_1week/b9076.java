package edoc2_1week;

import java.util.Arrays;
import java.util.Scanner;

public class b9076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int [] score= new int[5];
		int i=0;
		while(i<N) {
			i++;
			for(int j=0; j<5; j++) {
				score[j]=sc.nextInt();				
			}
			Arrays.sort(score);
			if(score[3]-score[1]>3) {
				System.out.println("KIN");
			}
			else {
				System.out.println(score[1]+score[2]+score[3]);
			}
			for(int k=0; k<score.length; k++) {
				System.out.print(score[k]+" ");
			}
			System.out.println();
		}
	}

}

package edoc11week;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class b2865 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();//참가자 수
		int M= sc.nextInt();//장르 수
		int K= sc.nextInt();//본선 진출 수
		float score[][]= new float [N+1][M]; 
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				score[sc.nextInt()][i]=sc.nextFloat();//사람번호*장르
			}
		}
		for(int i=0; i<N+1; i++) {
			Arrays.sort(score[i]);
		}
		float max_score_list []= new float [N+1]; 
		for(int i=0; i<N+1; i++) {
			max_score_list[i]= score[i][score[i].length-1];
		}
		Arrays.sort(max_score_list);
		float max=0;
		for(int i=0; i<K; i++) {
			max+=max_score_list[max_score_list.length-i-1];
		}
		
		System.out.printf("%.1f\n", max);
	}

}

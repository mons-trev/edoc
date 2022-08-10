package edoc2_1week;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class b8979 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt(); // 국가 갯수
		int nation= sc.nextInt();// 등수를 찾고 싶은 국가
		int data[][]= new int[N][4]; //국가 메달 정보
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<4; j++) {
					data[i][j]=sc.nextInt();
				}
			}
			Arrays.sort(data, new Comparator<int[]>() {
			    @Override
			    public int compare(int[] o1, int[] o2) {
			           return o1[0]-o2[0];
			       }
			    
		        });
		int rank=1; //등수 초기화
		//금메달 비교
		for(int i=0; i<N; i++) {
			if(data[i][0]==nation) continue;
			else {
				if(data[i][1]>data[nation-1][1]) {
					rank++;
				}
				//은메달 비교
				else if(data[i][1]==data[nation-1][1]&&data[i][2]>data[nation-1][2]) {
					rank++;
				}
				//동메달 비교
				else if(data[i][1]==data[nation-1][1]&&data[i][2]==data[nation-1][2]&&data[i][3]>data[nation-1][3]) {
					rank++;
				}
			}
		}
		System.out.println(rank);
	}

}

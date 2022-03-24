package edoc8week;

import java.util.Arrays;
import java.util.Scanner;

public class b9076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int s[]= new int[5];
		int n= sc.nextInt();
		for(int i=0; i<n; i++) {
			
			
			for(int j=0; j<5; j++) {// 점수 저장
			s[j]=sc.nextInt();
			}
			
			Arrays.sort(s);//오름차순 정렬
			
			  if(s[4]-s[1]<4) {// 2번째로 큰 점수 - 2번째로 작은 점수 <4 => 인덱스 1 2 3 더하기
			 
				int sum=0;
				for(int k=1; k<4; k++) {
					sum+=s[k];
				}
				System.out.println(sum);
			}
			else {
				System.out.println("KIN");
			}
			sc.close();
		}
	}

}

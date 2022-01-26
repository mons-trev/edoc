package edoc3week;

import java.util.Arrays;
import java.util.Scanner;

public class b11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		int dp[]= new int[n];// 동적 프로그래밍을 위한 dp 배열 생성
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		dp[0]=1; //dp[0]에 1 초기화(수열이 1개이므로)
		for(int i=1; i<arr.length; i++) {//값 넣을 dp 인덱스
			dp[i]=1;//1로 초기화
			for(int j=0; j<i; j++) {//비교할 dp 인덱스
				if(arr[i]>arr[j]) {
					if(dp[i]<=dp[j]) {
						dp[i]=dp[j]+1;
					}
				}
			}
		}
		int max=0;
		
		for(int i=0; i<dp.length; i++) {
			if(dp[i]>max) {
				max=dp[i];
			}
		}
		System.out.println(max);
		sc.close();
	}

}

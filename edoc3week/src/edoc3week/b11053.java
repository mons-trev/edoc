package edoc3week;

import java.util.Arrays;
import java.util.Scanner;

public class b11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		int dp[]= new int[n];// ���� ���α׷����� ���� dp �迭 ����
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		dp[0]=1; //dp[0]�� 1 �ʱ�ȭ(������ 1���̹Ƿ�)
		for(int i=1; i<arr.length; i++) {//�� ���� dp �ε���
			dp[i]=1;//1�� �ʱ�ȭ
			for(int j=0; j<i; j++) {//���� dp �ε���
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

package edoc2_4week;

import java.util.Arrays;
import java.util.Scanner;

public class b1449 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();//새는 위치 개수
		int l= sc.nextInt();//테이프 길이
		
		int loose[]= new int[n];//새는 위치
		for(int i=0; i<n; i++) {
			loose[i]=sc.nextInt();
		}
		
		Arrays.sort(loose); // 오름차순으로 새는 위치 정렬
		
		int value =1; // 길이는 자연수니까 적어도 하나는 막을 수 있기 때문에 1로 초기화.
		int start= loose[0];//한 테이프 붙이기 시작하는 위치
		
		for(int i=1; i<n; i++) {
			int des=loose[i];//한 테이프의 끝 위치
			if(des<start+l) { // 하나로 두 개를 막을 수 있는 경우 , value 그대로
			}
			else {
				value++; // 하나로 같이 못 막을 경우 테이프를 추가
				start=des;
			}
		}
		
		System.out.println(value);
		
	}

}

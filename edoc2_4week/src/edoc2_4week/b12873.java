package edoc2_4week;

import java.util.Scanner;



public class b12873 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();//사람 수
		int arr[]= new int [n];
		
		for(int i=0; i<n; i++) { 
			arr[i]=i+1;//참가자 번호 매기기 ; 인덱스 0부터
		}
		
		int t=1;//1단계로 초기화
		int start = 0;
		while(n!=1) {// 참가자가 한명만 남을 때까지
			
			int go= (t-1)%n*(t*t+t+1)%n;//포인터 위치, 분배법칙 사용
			go= (go+start)%n;
			start=go;
			t++;//단계 올리기
			for(int i=go; i<n-1; i++) {
				arr[i]=arr[i+1]; //하나 빠지면 앞으로 하나씩 땡기기
			}
			n--;
		}
        System.out.println(arr[0]);

	}

}

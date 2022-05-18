package edoc12week;

import java.util.Scanner;

public class b19592 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		
		while(T>0) {
		T--;
		int N= sc.nextInt();
		int X= sc.nextInt();
		int Y= sc.nextInt();
		int [] V= new int[N];
		int Max_speed=0;
		int result;
		double result2=0;
		for(int i=0; i<N; i++) {
			V[i]= sc.nextInt();
			if(i<N-1) {
				Max_speed=Math.max(Max_speed, V[i]);//나를 제외한 참가자 중 속력이 가장 빠른 사람의 속도
			}
		}
		double Max_speed_time=(1.0)*X/Max_speed;
		
		if(V[N-1]>Max_speed) {
			result=0;
		}
		else if(1+1.0*(X-Y)/V[N-1]>=Max_speed_time) {
			result=-1;
		}
		else {
			result2= (V[N-1]+X-((1.0)*V[N-1]*X/Max_speed));
			result= (int)result2+1;
		}
		
		
		//각 테스트마다 출력
		
		System.out.println(result);
		
		
		}
	}

}

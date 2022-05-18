package edoc12week;

import java.util.Scanner;

public class b19592 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		
		while(T>0) {
		T--;
		int N= sc.nextInt();//참가자 수
		int X= sc.nextInt();//거리
		int Y= sc.nextInt();//부스트 최대 속력
		int [] V= new int[N];//참가자들의 경주차 속도
		int Max_speed=0;// 나를 제외한 가장 빠른 속도를 가진 참가자의 속도
		int result;//부스터 사용 최소 거리
		
		for(int i=0; i<N; i++) {
			V[i]= sc.nextInt();
			if(i<N-1) {
				Max_speed=Math.max(Max_speed, V[i]);//나를 제외한 참가자 중 속력이 가장 빠른 사람의 속도
			}
		}
		double Max_speed_time=(1.0)*X/Max_speed;//나 외에 속도가 가장 빠른 참가자의 경주 소요시간
		
		
		//부스터를 안 써도 이길 때=부스터를 안 쓴 원래 속도가 가장 빠를 때
		if(V[N-1]>Max_speed) {
			result=0;
		}
		//부스터를 최대로 써도 소요시간이 가장 짧지 않아 이기지 못할 때
		else if(1+1.0*(X-Y)/V[N-1]>=Max_speed_time) {
			result=-1;
		}
		//부스터를 쓰면 이길 수 있을 때, 최소 부스터
		else {
			double result2=0;
			result2= (V[N-1]+X-((1.0)*V[N-1]*X/Max_speed)); //수학 공식 사용
			result= (int)result2+1;//double형을 int 형으로 변환
		}
		//각 테스트마다 출력	
		System.out.println(result);
		
		
		}
	}

}

package edoc12week;

import java.util.Scanner;

public class b19592 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		
		while(T>0) {
		T--;
		int N= sc.nextInt();//������ ��
		int X= sc.nextInt();//�Ÿ�
		int Y= sc.nextInt();//�ν�Ʈ �ִ� �ӷ�
		int [] V= new int[N];//�����ڵ��� ������ �ӵ�
		int Max_speed=0;// ���� ������ ���� ���� �ӵ��� ���� �������� �ӵ�
		int result;//�ν��� ��� �ּ� �Ÿ�
		
		for(int i=0; i<N; i++) {
			V[i]= sc.nextInt();
			if(i<N-1) {
				Max_speed=Math.max(Max_speed, V[i]);//���� ������ ������ �� �ӷ��� ���� ���� ����� �ӵ�
			}
		}
		double Max_speed_time=(1.0)*X/Max_speed;//�� �ܿ� �ӵ��� ���� ���� �������� ���� �ҿ�ð�
		
		
		//�ν��͸� �� �ᵵ �̱� ��=�ν��͸� �� �� ���� �ӵ��� ���� ���� ��
		if(V[N-1]>Max_speed) {
			result=0;
		}
		//�ν��͸� �ִ�� �ᵵ �ҿ�ð��� ���� ª�� �ʾ� �̱��� ���� ��
		else if(1+1.0*(X-Y)/V[N-1]>=Max_speed_time) {
			result=-1;
		}
		//�ν��͸� ���� �̱� �� ���� ��, �ּ� �ν���
		else {
			double result2=0;
			result2= (V[N-1]+X-((1.0)*V[N-1]*X/Max_speed)); //���� ���� ���
			result= (int)result2+1;//double���� int ������ ��ȯ
		}
		//�� �׽�Ʈ���� ���	
		System.out.println(result);
		
		
		}
	}

}

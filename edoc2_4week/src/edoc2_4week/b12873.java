package edoc2_4week;

import java.util.Scanner;



public class b12873 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();//��� ��
		int arr[]= new int [n];
		
		for(int i=0; i<n; i++) { 
			arr[i]=i+1;//������ ��ȣ �ű�� ; �ε��� 0����
		}
		
		int t=1;//1�ܰ�� �ʱ�ȭ
		int start = 0;
		while(n!=1) {// �����ڰ� �Ѹ� ���� ������
			
			int go= (t-1)%n*(t*t+t+1)%n;//������ ��ġ, �й��Ģ ���
			go= (go+start)%n;
			start=go;
			t++;//�ܰ� �ø���
			for(int i=go; i<n-1; i++) {
				arr[i]=arr[i+1]; //�ϳ� ������ ������ �ϳ��� �����
			}
			n--;
		}
        System.out.println(arr[0]);

	}

}

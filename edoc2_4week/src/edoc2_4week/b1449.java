package edoc2_4week;

import java.util.Arrays;
import java.util.Scanner;

public class b1449 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();//���� ��ġ ����
		int l= sc.nextInt();//������ ����
		
		int loose[]= new int[n];//���� ��ġ
		for(int i=0; i<n; i++) {
			loose[i]=sc.nextInt();
		}
		
		Arrays.sort(loose); // ������������ ���� ��ġ ����
		
		int value =1; // ���̴� �ڿ����ϱ� ��� �ϳ��� ���� �� �ֱ� ������ 1�� �ʱ�ȭ.
		int start= loose[0];//�� ������ ���̱� �����ϴ� ��ġ
		
		for(int i=1; i<n; i++) {
			int des=loose[i];//�� �������� �� ��ġ
			if(des<start+l) { // �ϳ��� �� ���� ���� �� �ִ� ��� , value �״��
			}
			else {
				value++; // �ϳ��� ���� �� ���� ��� �������� �߰�
				start=des;
			}
		}
		
		System.out.println(value);
		
	}

}

package edoc1week;

import java.util.Scanner;
import java.util.Vector;

public class b9009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();//����� ������ ���� �Է�
		int[] testarr = new int[num];//����� ������ �迭 ����, ����
		for(int i =0; i<testarr.length; i++){//����� ������ �迭 �Է�
			testarr[i] = sc.nextInt();
		}
		int[] fibo = new int[45];//�Ǻ���ġ �迭 ���� ����, 1 �� n �� 1,000,000,000 �̹Ƿ� 45��° �Ǻ���ġ ���� 1,134,903,170 �̹Ƿ� �迭�� 45���� ���� 
		fibo[0] = 1;//fibo[0]=0�� �ǳʶڴ�.
		fibo[1] = 1;
		for(int i=2; i<fibo.length; i++){//�Ǻ���ġ �迭 �Է�
			fibo[i] = fibo[i-2] + fibo[i-1];
		}
		
		Vector<Integer> print= new Vector<>();//����� ���� ����(���� �� ���� ����ؾ� �ϹǷ�)
		for(int i=0; i<num; i++) {//num��ŭ(4) ���� ������
			int t= testarr[i];//���ؾߵǴ� �� ����, ���� �Ǵµ� test[i]�� �ٷ��ϸ� ���� ���� �ǹǷ� �ϳ� �����Ѵ�.
			
			
			for(int j=44; j<fibo.length;j--) {//ū ������ ���ؾߵǹǷ� �Ǻ���ġ �迭 �ڿ������� �����Ѵ�.
				if(t==0) {//t�� 0�� �� �� break!
					for(int k=print.size(); k>0; k--) {//������ ����  ���, �ڿ������� ���
						System.out.print(print.get(k-1)+" ");
					}
					System.out.println();
					print.clear();//���� ����
					break;//for ���� ����� ���� ������ ó���Ѵ�.
				}
				if(t>=fibo[j]) {// �Ǻ���ġ �迭�� �ڿ������� ��
					print.add(fibo[j]);//����� ���Ϳ� ����
					t=t-fibo[j];//t�� 0�� �� ������ �ݺ��ؾ��ϹǷ� ����.
				}
			}
			
			
		}
		
	}

}

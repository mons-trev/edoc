package edoc1week;

import java.util.Arrays;
import java.util.Scanner;

public class b11582 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int store_num= sc.nextInt(); //// ġŲ�� ���� �� �Է�
		int arr[] = new int [store_num];  // ġŲ�� �� ��ġ ���� �迭 ����, ����
		for(int i=0; i<store_num; i++) { //ġŲ�� �� ��ġ ����
			arr[i]= sc.nextInt();
		}	
		int stop= sc.nextInt();//�� ��°�� �������
		int first_index= 1;// ���� �ε��� ������ 
		int k=0;
		for(int i=0; i<stop; i++) {
			//ex) ġŲ���� 8���̰� ù��°�� ����ٸ� �����ؾ� �� �ε��� ó�� ��ȣ�� 0 2 4 6 �̴�. ���� ù��°�� ����ٸ� 2�� 1�� ��ŭ �ε����� ��������
			// �ι�°�� ����ٸ� 2�� 2�¸�ŭ �ε����� �������Ƿ� ó�� �ε����� � ���ؾ����� ���ϴ� for loop.
			first_index= first_index*2;
		}

			for(int j=0; j<store_num/first_index ; j++) {
				// �����ؾ� �Ǵ� Ƚ��, ���� ��� �迭 8�� ¥�� ������ ù��°�� ���ؼ� ���Ѵٸ� 2���� ¦ ��� 4�� �����ؾߵ�
				Arrays.sort(arr, k, k+first_index);
				k= k+first_index;// ���� ù��° �ε��� ���ϱ�
			}

			
		for(int i=0; i<store_num; i++) {//���� ���
				System.out.print(arr[i]+" ");
			}
		sc.close();
		
	}

}

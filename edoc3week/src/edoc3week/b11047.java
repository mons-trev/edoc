package edoc3week;

import java.util.Scanner;

public class b11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();//���� ���� ��
		int arr[]= new int[num];
		int price= sc.nextInt();//����
		int count=0;//Ƚ��
		for(int i=0; i<num; i++) {//���� ���� �Է�
			arr[i]=sc.nextInt();
		}
		int sub= price;//0�� �� ������ �����ϹǷ� sub ���� ����, price ������ �ʱ�ȭ
		for(int i=arr.length-1; i>=0; i--) {//////////////////////////////������ ū ������ ��
			int c=0;//������ �� �ʱ�ȭ
			if(sub>=arr[i]) {// �ڿ������� ���Ͽ� sub���� �ٷ� ���� ������ �߰��ϸ� �� ���ǹ��� �ɸ�
				if(i==arr.length-1) {//���� sub���� �ٷ� ���� ������ �� ������ �����̶��
					for(int j=1;j<=sub/arr[i]+1; j++) {//sub���� �ٷ� ���� ������ �� ���ؾ� �ִ��� price�� ����� ������ ���ϴ� �ݺ���, arr[i+1]�� �ϸ� �迭 �ε����� �ʰ��ϱ� ������ ���� ���ؾߵ�
						c=arr[i]*j;
						count++;//��� �� ������ count�� �ϳ��� ����
						if(c>sub ) {//�׳� break�ϸ� sub-c�� ���� �ǹǷ�
							c=arr[i]*(j-1);//j�� �ƴ϶� j-1����
							count--;//count �ϳ� ����
							break;
						}
					}
				}
				else {//���� sub���� �ٷ� ���� ������ �߰��� �����̶��
					for(int j=1; j<=arr[i+1]/arr[i]+1; j++ ) {//j<sub/arr[i]+1�� �ƴ϶� j<arr[i+1]/arr[i+1]/arr[i]+1
					c= arr[i]*j;
					count++;
					if(c>sub) {
						c=arr[i]*(j-1);
						count--;
						break;
					}
				}
			}
				
				
			}
			sub=sub-c;
				if(sub==0) {//sub�� 0�� �� ������ �ݺ�
					break;
				}
		}//////////////////////////////////////////////////////////////
		sc.close();
		System.out.println(count);
	}

}

package edoc2_1week;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class b8979 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt(); // ���� ����
		int nation= sc.nextInt();// ����� ã�� ���� ����
		int data[][]= new int[N][4]; //���� �޴� ����
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<4; j++) {
					data[i][j]=sc.nextInt();
				}
			}
			Arrays.sort(data, new Comparator<int[]>() {
			    @Override
			    public int compare(int[] o1, int[] o2) {
			           return o1[0]-o2[0];
			       }
			    
		        });
		int rank=1; //��� �ʱ�ȭ
		//�ݸ޴� ��
		for(int i=0; i<N; i++) {
			if(data[i][0]==nation) continue;
			else {
				if(data[i][1]>data[nation-1][1]) {
					rank++;
				}
				//���޴� ��
				else if(data[i][1]==data[nation-1][1]&&data[i][2]>data[nation-1][2]) {
					rank++;
				}
				//���޴� ��
				else if(data[i][1]==data[nation-1][1]&&data[i][2]==data[nation-1][2]&&data[i][3]>data[nation-1][3]) {
					rank++;
				}
			}
		}
		System.out.println(rank);
	}

}

package edoc5week;

import java.util.Scanner;
import java.util.Vector;

public class b1865 {

	public int[] makegraph(int a, int b, int value) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int tc= sc.nextInt();
		int i=0;
		while(i<tc) {//�׽�Ʈ ���̽�
			int arr[][];
			int wormarr[][];
			Vector<Integer> wormstart= new Vector<>();//wormhole start ��� ��Ƶ� ����4
			wormstart.add(0);// 0��° �ε����� 0���� ����α�
			int node=sc.nextInt();
			int road=sc.nextInt();
			int wormhole=sc.nextInt();
			arr=new int[node+1][node+1];
			wormarr=new int[node+1][node+1];
			for(int k=0;k<arr.length; k++) {
				for(int u=0; u<arr.length; u++) {
					arr[k][u]=10000;
				}
			}
			for(int k=0;k<wormarr.length; k++) {
				for(int u=0; u<arr.length; u++) {
					wormarr[k][u]=0;
				}
			}
			for(int j=0; j<road; j++) {
				int start= sc.nextInt();
				int finish= sc.nextInt();
				int time= sc.nextInt();
				if(time<arr[start][finish]) {
					arr[start][finish]=time;
					arr[finish][start]=time;
				}
			}
			for(int t=0; t<wormhole; t++) {
				int start= sc.nextInt();
				wormstart.add(start);
				int finish= sc.nextInt();
				int time= sc.nextInt();
				wormarr[start][finish]= (0-time);
			}
			int k=1;
			while(k<wormhole+1) {//��Ȧ ������ŭ �ݺ�
				int toworm=wormstart.get(k);//��Ȧ ���� ��� �ε��� 1���� ��� 
				for(int a=0;a<arr.length;a++) {
					int min= arr[0][toworm];
					if(arr[a][toworm]<min) {
						min=arr[a][toworm];
					}
				}
				for(int a=0;a<arr.length;a++) {
					int min= arr[toworm][a];
					if(arr[toworm][a]<min) {
						min=arr[toworm][a];
					}
				}
				k++;
			}
			
			i++;
			wormstart.clear();
		}
	}

}

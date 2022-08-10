package edoc2_5week;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class b2667 {

	static int n;
	static int [][] map;
	static boolean visit[][];
	static int number;
	static void dfs (int i, int j) {//���� �켱 Ž��
		visit[i][j] = true;
		number++;
		if(i<n-1&&map[i+1][j]==1&&!visit[i+1][j]) {//��
			visit[i+1][j]=true;
			dfs(i+1,j);
		}
		if(j<n-1&&map[i][j+1]==1&&!visit[i][j+1]) {//��
			visit[i][j+1]=true;
			dfs(i,j+1);
		}
		if(i>0&&map[i-1][j]==1&&!visit[i-1][j]) {//��
			visit[i-1][j]=true;
			dfs(i-1,j);
		}
		if(j>0&&map[i][j-1]==1&&!visit[i][j-1]) {//��
			visit[i][j-1]=true;
			dfs(i,j-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		map= new int [n][n];
		visit = new boolean[n][n]; //false�� �ʱ�ȭ
		int result=0;
		ArrayList<Integer> num= new ArrayList<>();
		for(int i=0; i<n; i++) {//�迭 �����
			String row=sc.next();
			for(int j=0; j<n; j++) {
				map[i][j] = Character.getNumericValue(row.charAt(j));
			}
		}
		
		for(int i=0; i<n; i++) {//dfs����
			for(int j=0; j<n; j++) {
				if(visit[i][j]==false&&map[i][j]==1) {//���� �湮�� ���� �ʾҰ� ���� �ִ� ���̶�� dfs ����!
					number=0;//�� ���� ���� ����Ʈ ��
					result++;//���� ����
					dfs(i,j);
					num.add(number);
				}
			}
		}
		System.out.println(result);//���� ��
		Collections.sort(num);//�������� ����
		for(int i=0; i<num.size(); i++) {
			System.out.println(num.get(i));//������ ����Ʈ ��
		}
			
	}

}

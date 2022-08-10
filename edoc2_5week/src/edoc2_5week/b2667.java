package edoc2_5week;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class b2667 {

	static int n;
	static int [][] map;
	static boolean visit[][];
	static int number;
	static void dfs (int i, int j) {//깊이 우선 탐색
		visit[i][j] = true;
		number++;
		if(i<n-1&&map[i+1][j]==1&&!visit[i+1][j]) {//하
			visit[i+1][j]=true;
			dfs(i+1,j);
		}
		if(j<n-1&&map[i][j+1]==1&&!visit[i][j+1]) {//우
			visit[i][j+1]=true;
			dfs(i,j+1);
		}
		if(i>0&&map[i-1][j]==1&&!visit[i-1][j]) {//상
			visit[i-1][j]=true;
			dfs(i-1,j);
		}
		if(j>0&&map[i][j-1]==1&&!visit[i][j-1]) {//좌
			visit[i][j-1]=true;
			dfs(i,j-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		map= new int [n][n];
		visit = new boolean[n][n]; //false로 초기화
		int result=0;
		ArrayList<Integer> num= new ArrayList<>();
		for(int i=0; i<n; i++) {//배열 만들기
			String row=sc.next();
			for(int j=0; j<n; j++) {
				map[i][j] = Character.getNumericValue(row.charAt(j));
			}
		}
		
		for(int i=0; i<n; i++) {//dfs시작
			for(int j=0; j<n; j++) {
				if(visit[i][j]==false&&map[i][j]==1) {//아직 방문을 하지 않았고 집이 있는 곳이라면 dfs 시작!
					number=0;//한 단지 내의 아파트 수
					result++;//단지 개수
					dfs(i,j);
					num.add(number);
				}
			}
		}
		System.out.println(result);//단지 수
		Collections.sort(num);//오름차순 정렬
		for(int i=0; i<num.size(); i++) {
			System.out.println(num.get(i));//단지내 아파트 수
		}
			
	}

}

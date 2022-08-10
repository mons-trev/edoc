package edoc13week;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class b1707 {
	
	static HashMap<Integer, Integer> nodesdivide = new HashMap<>();
	
	public static void divide(int graph[][], int n, Boolean [] flag, int node) {//여기서 n은 main의 n+1
		
		//Boolean [] flag= new Boolean [n];
		for(int i=1; i<n+1; n++) {
			if(graph[node][i]==1&&flag[node]==false) {
				flag[i]=true;
				nodesdivide.put(i, Math.abs(1-nodesdivide.get(node)));
				divide(graph, node, flag, i);
			}
		}
		
		for(int i=0; i<node+1; i++) {
			System.out.println(flag[i]);
		}
		System.out.println("--------------");
	}
	
	public static void decide(int [][] graph, int n) {
		for(int i=1; i<n; i++) {
			for(int j=i+1; j<n+1; j++) {
				if(graph[i][j]==1&&nodesdivide.get(i).equals(nodesdivide.get(j))) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0) {
			int node= sc.nextInt();
			int edge =sc.nextInt();
			int [][] graph= new int[node+1][node+1];
			//Arrays.fill(graph, 0);
			for(int i=0; i<edge; i++) {
				int a= sc.nextInt();
				int b= sc.nextInt();
				graph[a][b]=1;
				graph[b][a]=1;
			}
			nodesdivide.put(1, 0);
			Boolean [] flag= new Boolean[node+1];
			Arrays.fill(flag, false);
			flag[0]=true;
			divide(graph,node,flag,1);
			
			decide(graph, node);
			
			n--;
		}
	}

}

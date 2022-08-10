package edoc14week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        //그래프 배열 선언
        int [][] graph = new int[n+1][n+1];
        //방문 노드
        boolean [] visited = new boolean[n+1];
        visited[1]= true;
        //bfs 큐
        Queue<Integer> bfs = new LinkedList()<Integer>();
        //distance
        int [] distance = new int[n+1];
        //그래프 배열 생성
        int a=0;
        int b=0;
        for(int i=0; i<edge.length; i++) {
            for(int j=0; j<edge[0].length; j++) {
                if(j==0){
                  a= edge[i][j];
                } 
                else {
                  b= edge[i][j];
                }
            }
            graph[a][b]=1;
            graph[b][a]=1;
        }
        while(bfs.size()!=0){
            int k= bfs.poll();
            for (int i=0; i<n+1; i++){
            if(graph[k][i]==1&&visited[i]!=true){
                bfs.add(i);
                visited[i]=true;
                distance[i]=distance[k]+1;
            }
        }
        }
        ArrayList<Integer> print= new ArrayList<>();
        int max=0;
        for(int i=2; i<distance.length; i++) {
            if(distance[i]>max) {
                max=distance[i];
                print.clear();
                print.add(distance[i]);
            }
        }
        
    }
}
public class programmers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

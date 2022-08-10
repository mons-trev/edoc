package edoc13week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b16173 {
	
	static int Map[][];
	static int n;
	static boolean reach=false;
	
	
	static void search(int a, int b) {
	
	int value=Map[a][b];
	
		if(a==n-1&&b==n-1) {//아래 오른쪽 도착
			reach=true;
			return;
		}
		else if(n-1-a+n-1-b<value||reach==true){
			return;
		}
		else if(value==0) {
			return;
		}
		else {
			
				if(a+value<=n-1) search(a+value,b);
				if(b+value<=n-1) search(a, b+value);
		}
			
	}		
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader선언
		n = Integer.parseInt(bf.readLine());
		StringTokenizer st=null;
		Map= new int [n][n];
		
		for(int i=0; i<n; i++) {
			st= new StringTokenizer(bf.readLine());
			for(int j=0; j<n; j++) {
				Map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		search(0, 0);
		if(reach==true) System.out.println("HaruHaru");
		else System.out.println("Hing");
		
	}

}
//5칸 이동 3*3 
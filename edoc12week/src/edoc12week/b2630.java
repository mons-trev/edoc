package edoc12week;

import java.util.Scanner;

public class b2630 {

	static int white=0;
	static int blue=0;
	
	static void divide(int [][] arr, int n) {
		
		//칸이 하나일 때
		if(n==1) {
			if(arr[0][0]==0) {
				white++;
			}
			else {
				blue++;
			}
		}
		//칸이 하나가 아닐 때
		else {
			int count=0;
			//나뉘어진 칸이 같은 색으로 칠해져있을 때
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++){
					count+=arr[i][j];
				}
			}
			if(count==n*n) {
				blue++;
			}
			else if (count==0) {
				white++;
			}
			//같은 색으로 칠해져 있지 않을 때
			else {
				int k=4;
				int derivearr[][]= new int[n/2][n/2];
				while(k>0) {
					
					if(k==4) {
						for(int i=0; i<n/2; i++) {
							for(int j=0; j<n/2; j++) {
								derivearr[i][j]=arr[i][j];
							}
						}
						//System.out.println("1 적재");

						divide(derivearr,n/2);
						
					}
					else if(k==3) {
							for(int i=0; i<n/2; i++) {
								for(int j=0; j<n/2; j++) {
									derivearr[i][j]=arr[n/2+i][j];
								}
							}
						//System.out.println("2 적재");
							divide(derivearr, n/2);
					}
					else if(k==2) {
						for(int i=0; i<n/2; i++) {
							for(int j=0; j<n/2; j++) {
								derivearr[i][j]=arr[i][n/2+j];
							}
						}
						//System.out.println("3 적재");
						divide(derivearr, n/2);
					}
					else{
							for(int i=0; i<n/2; i++) {
								for(int j=0; j<n/2; j++) {
									derivearr[i][j]=arr[n/2+i][n/2+j];
								}
							}
						//System.out.println("4 적재");
							divide(derivearr, n/2);
					}
					k--;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int paper[][]= new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				paper[i][j]=sc.nextInt();
			}
		}
		divide(paper, n);
		System.out.println(white);
		System.out.println(blue);
	}

}

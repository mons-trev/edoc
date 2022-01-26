package edoc3week;

import java.util.Scanner;

public class b11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();//동전 종류 수
		int arr[]= new int[num];
		int price= sc.nextInt();//가격
		int count=0;//횟수
		for(int i=0; i<num; i++) {//동전 종류 입력
			arr[i]=sc.nextInt();
		}
		int sub= price;//0이 될 때까지 빼야하므로 sub 변수 생성, price 값으로 초기화
		for(int i=arr.length-1; i>=0; i--) {//////////////////////////////동전을 큰 수부터 비교
			int c=0;//빼야할 값 초기화
			if(sub>=arr[i]) {// 뒤에서부터 비교하여 sub보다 바로 작은 동전을 발견하면 이 조건문에 걸림
				if(i==arr.length-1) {//만약 sub보다 바로 작은 동전이 맨 마지막 동전이라면
					for(int j=1;j<=sub/arr[i]+1; j++) {//sub보다 바로 작은 동전을 몇 배해야 최대한 price랑 가까워 지는지 구하는 반복문, arr[i+1]을 하면 배열 인덱스가 초과하기 때문에 따로 구해야됨
						c=arr[i]*j;
						count++;//배수 될 떄마다 count를 하나씩 증가
						if(c>sub ) {//그냥 break하면 sub-c가 음수 되므로
							c=arr[i]*(j-1);//j가 아니라 j-1대입
							count--;//count 하나 감소
							break;
						}
					}
				}
				else {//만약 sub보다 바로 작은 동전이 중간의 동전이라면
					for(int j=1; j<=arr[i+1]/arr[i]+1; j++ ) {//j<sub/arr[i]+1이 아니라 j<arr[i+1]/arr[i+1]/arr[i]+1
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
				if(sub==0) {//sub이 0이 될 때까지 반복
					break;
				}
		}//////////////////////////////////////////////////////////////
		sc.close();
		System.out.println(count);
	}

}

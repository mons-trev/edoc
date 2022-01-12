package edoc1week;

import java.util.Scanner;
import java.util.Vector;

public class b9009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();//출력할 데이터 갯수 입력
		int[] testarr = new int[num];//출력할 데이터 배열 선언, 생성
		for(int i =0; i<testarr.length; i++){//출력할 데이터 배열 입력
			testarr[i] = sc.nextInt();
		}
		int[] fibo = new int[45];//피보나치 배열 선언 생성, 1 ≤ n ≤ 1,000,000,000 이므로 45번째 피보나치 수는 1,134,903,170 이므로 배열은 45개만 생성 
		fibo[0] = 1;//fibo[0]=0은 건너뛴다.
		fibo[1] = 1;
		for(int i=2; i<fibo.length; i++){//피보나치 배열 입력
			fibo[i] = fibo[i-2] + fibo[i-1];
		}
		
		Vector<Integer> print= new Vector<>();//출력할 벡터 생성(작은 수 부터 출력해야 하므로)
		for(int i=0; i<num; i++) {//num만큼(4) 루프 돌리기
			int t= testarr[i];//구해야되는 수 복제, 빼야 되는데 test[i]에 바로하면 값이 누적 되므로 하나 복제한다.
			
			
			for(int j=44; j<fibo.length;j--) {//큰 수부터 구해야되므로 피보나치 배열 뒤에서부터 시작한다.
				if(t==0) {//t가 0이 될 떄 break!
					for(int k=print.size(); k>0; k--) {//저장한 벡터  출력, 뒤에서부터 출력
						System.out.print(print.get(k-1)+" ");
					}
					System.out.println();
					print.clear();//벡터 비우기
					break;//for 루프 벗어나서 다음 데이터 처리한다.
				}
				if(t>=fibo[j]) {// 피보나치 배열의 뒤에서부터 비교
					print.add(fibo[j]);//출력할 벡터에 저장
					t=t-fibo[j];//t가 0이 될 떄까지 반복해야하므로 뺀다.
				}
			}
			
			
		}
		
	}

}

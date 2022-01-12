package edoc1week;

import java.util.Arrays;
import java.util.Scanner;

public class b11582 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int store_num= sc.nextInt(); //// 치킨집 가게 수 입력
		int arr[] = new int [store_num];  // 치킨집 맛 수치 저장 배열 선언, 생성
		for(int i=0; i<store_num; i++) { //치킨집 맛 수치 저장
			arr[i]= sc.nextInt();
		}	
		int stop= sc.nextInt();//몇 번째에 멈출건지
		int first_index= 1;// 정렬 인덱스 시작점 
		int k=0;
		for(int i=0; i<stop; i++) {
			//ex) 치킨집이 8개이고 첫번째에 멈춘다면 정렬해야 될 인덱스 처음 번호는 0 2 4 6 이다. 따라서 첫번째에 멈춘다면 2의 1승 만큼 인덱스가 더해지고
			// 두번째에 멈춘다면 2의 2승만큼 인덱스가 더해지므로 처음 인덱스를 몇씩 더해야할지 구하는 for loop.
			first_index= first_index*2;
		}

			for(int j=0; j<store_num/first_index ; j++) {
				// 정렬해야 되는 횟수, 예를 들어 배열 8개 짜리 정렬을 첫번째에 컷해서 구한다면 2개씩 짝 지어서 4번 정렬해야됨
				Arrays.sort(arr, k, k+first_index);
				k= k+first_index;// 정렬 첫번째 인덱스 구하기
			}

			
		for(int i=0; i<store_num; i++) {//정렬 출력
				System.out.print(arr[i]+" ");
			}
		sc.close();
		
	}

}

package edoc8week;
import java.util.Arrays;
import java.util.Scanner;
public class b1337 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);//오름차순 정렬
		int count;
		int max=0;
		for(int i=0; i<n-1; i++) {// 비교 시작
			count=0;
			for(int j=1; j<5; j++) {
				if(i+j>=n) break;//인덱스 벗어나면 break
				else if(arr[i+j]>arr[i]+4) break;
				else count++;
			}
			if(count>max) max=count;
		}
		System.out.println(5-1-max);
		sc.close();
	}
}
